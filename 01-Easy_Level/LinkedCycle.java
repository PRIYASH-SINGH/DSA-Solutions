//Problem Statement Determine if a linked list has a cycle in it. 
// Topics Linked List Examples 
// Example 1 Input: [1, 2] Output: false Example 2 Input: [1] Output: false
// problem provided by my college as DSA daily challenge
// performing using hashset
class Solution 
{
    static class ListNode  //defining node of linked list
    {
        int val;//stores value of node
        ListNode next;//stores address of next node
        ListNode(int val)//constructor
        {
            this.val=val;//intializing value
            this.next=null;//intializing next
        }
    }
    public boolean hasCycle(ListNode head) 
    {

        // Edge case check
        // if list is empty or has only 1 node
        // it cannot have a cycle
        if (head == null || head.next == null) {
            return false;
        }

        // Initialize two pointers
        // both start at head
        ListNode slow = head;  //  moves 1 step
        ListNode fast = head;  //  moves 2 steps

        // Keeps moving until fast hits null
        // fast.next != null ensures fast.next.next won't crash
        while (fast != null && fast.next != null) 
            //checking fast head pointer node and its next node is null or not
            {

            // Move pointers
            slow = slow.next;        // 1 step forward
            fast = fast.next.next;   // 2 steps forward

            // Check if they met
            // if same node → cycle confirmed
            if (slow == fast) {
                return true;
            }
        }

        // Fast reached end → no cycle
        return false;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);//creating linked list manually
        head.next = new ListNode(2);// it does not means 2 is next to 3 it just means 2 is the value of the next node
        head.next.next = new ListNode(0);// same here 0 is value of next node which is 3rd node in our case
        head.next.next.next = new ListNode(-4);//
        head.next.next.next.next = head;//making cycle
        Solution s=new Solution();
        System.out.println(s.hasCycle(head));//printing result
    }
}
