public class IntersectionNode {
    // A ListNode represents a single node in our singly linked list.
    // Each node contains a value (val) and a pointer/reference to the next node (next).
    static class ListNode {
        int val;        // Stores the integer value of the node
        ListNode next;  // Pointer/reference to the next node in the list, defaults to null

        // Constructor to create a new node with a specific value
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Method to find the intersection node where two singly linked lists meet.
    // If they do not intersect, it returns null.
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        // Start two pointers, one at the head of list A, and one at the head of list B
        ListNode ptrA = headA;
        ListNode ptrB = headB;
        
        // If either of the lists is empty (null), they can never intersect
        if (ptrA == null || ptrB == null) {
            return null;
        }
        
        // Traverse both lists.
        // We run the loop as long as the two pointers are pointing to different nodes in memory.
        while (ptrA != ptrB) {
            
            // If pointer A reaches the end of list A (becomes null),
            // redirect it to the head of list B.
            // Otherwise, move pointer A to the next node in list A.
            if (ptrA == null) {
                ptrA = headB;
            } else {
                ptrA = ptrA.next;
            }
            
            // If pointer B reaches the end of list B (becomes null),
            // redirect it to the head of list A.
            // Otherwise, move pointer B to the next node in list B.
            if (ptrB == null) {
                ptrB = headA;
            } else {
                ptrB = ptrB.next;
            }
        }
        
        // Why does this two-pointer redirection work?
        // Let the length of list A before the intersection be 'a'
        // Let the length of list B before the intersection be 'b'
        // Let the length of the shared/common part be 'c'
        //
        // - Pointer A will travel: (a + c) steps on List A, then switch to List B and travel 'b' steps.
        //   Total steps for Pointer A = a + c + b
        //
        // - Pointer B will travel: (b + c) steps on List B, then switch to List A and travel 'a' steps.
        //   Total steps for Pointer B = b + c + a
        //
        // Since a + c + b == b + c + a, both pointers will have traveled the exact same number of steps
        // when they meet at the start of the common/shared part (the intersection node)!
        // If there is no intersection (c = 0), they will both finish after traveling (a + b) steps
        // and meet at null, which terminates the loop.
        
        // When the loop terminates, ptrA is equal to ptrB.
        // This is either the intersection node or null (if no intersection exists).
        return ptrA;
    }

    public static void main(String[] args) {
        // Create an instance of our IntersectionNode solver class
        IntersectionNode sol = new IntersectionNode();

        // Let's build two intersecting linked lists:
        // List A: 4 -> 1 -> 8 -> 4 -> 5
        // List B: 5 -> 6 -> 1 -> 8 -> 4 -> 5
        // Both lists should intersect at the node with value 8.
        //
        // Note: We MUST create a shared node object in memory for the intersection.
        // If we simply create separate new ListNode(8) objects, they will reside at 
        // different memory addresses, and the code will report "No intersection" 
        // because the getIntersectionNode method checks for reference/memory equality (ptrA == ptrB).

        // 1. Create the shared/intersecting part: 8 -> 4 -> 5
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        // 2. Create the unique part of List A: 4 -> 1
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        
        // Attach the common part to the end of List A
        headA.next.next = common;

        // 3. Create the unique part of List B: 5 -> 6 -> 1
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);

        // Attach the same common part to the end of List B
        headB.next.next.next = common;

        // Call the method to find the intersection node
        ListNode intersectionNode = sol.getIntersectionNode(headA, headB);

        // Print the result to the console
        if (intersectionNode != null) {
            System.out.println("Intersection node found with value: " + intersectionNode.val);
        } else {
            System.out.println("No intersection node found.");
        }
    }   
}
