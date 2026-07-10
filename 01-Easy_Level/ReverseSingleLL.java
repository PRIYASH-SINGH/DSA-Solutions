//Reverse a singly linked list. 
// Topics Linked List Examples 
// Example 1 Input: [1, 2, 3] Output: [3, 2, 1] Example 2 Input: [1, 2] Output: [2, 1]
class ReverseSingleLL
{
    // Node definition for the singly linked list
    static class ListNode 
    {
        int val; // Value stored in the node
        ListNode next; // Pointer to the next node
        
        ListNode(int val) 
        {
            this.val = val;
            this.next = null;
        }
    }

    // Method to reverse the singly linked list
    public ListNode reverseList(ListNode head) 
    {
        ListNode prev = null; // Points to the previous node
        ListNode curr = head; // Points to the current node
        
        while (curr != null) 
        {
            ListNode nextTemp = curr.next; // Store next node
            curr.next = prev;              // Reverse the link
            prev = curr;                   // Move prev pointer forward
            curr = nextTemp;               // Move curr pointer forward
        }
        return prev; // New head of the reversed list
    }

    public static void main(String[] args) 
    {
        // Hardcoded input list: [1, 2]
        ListNode head = new ListNode(1); 
        head.next = new ListNode(2); 

        System.out.print("Original List: "); 
        printList(head); 

        ReverseSingleLL reverseObj = new ReverseSingleLL(); 
        ListNode reversedHead = reverseObj.reverseList(head); 

        System.out.print("Reversed List: "); 
        printList(reversedHead); 
    }

    // Helper method to print the linked list
    private static void printList(ListNode head) 
    {
        ListNode temp = head;
        while (temp != null) 
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
