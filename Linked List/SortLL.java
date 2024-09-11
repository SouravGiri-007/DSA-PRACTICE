class ListNode {
    int val;
    ListNode next;

    // Constructor to initialize a node
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SortLL {

    // Function to merge two sorted linked lists
    ListNode mergeTwoSortedLinkedLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1);  // A dummy node to help with the merge process
        ListNode temp = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        // Attach any remaining nodes from list1 or list2
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return dummyNode.next;  // Return the merged list, skipping the dummy node
    }

    // Function to find the middle of the linked list
    ListNode findMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        // Move 'slow' by one and 'fast' by two steps to find the middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;  // Slow pointer will be at the middle of the list
    }

    // Function to sort the linked list using merge sort
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the linked list
        ListNode middle = findMiddle(head);
        ListNode right = middle.next;
        middle.next = null;  // Split the list into two halves
        ListNode left = head;

        // Recursively sort both halves
        left = sortList(left);
        right = sortList(right);

        // Merge the sorted halves
        return mergeTwoSortedLinkedLists(left, right);
    }

    // Utility function to print the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main function to test the sorting
    public static void main(String[] args) {
        SortLL listSorter = new SortLL();

        // Create a linked list: 4 -> 2 -> 1 -> 3
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        System.out.println("Original list:");
        listSorter.printList(head);

        // Sort the linked list
        head = listSorter.sortList(head);

        System.out.println("Sorted list:");
        listSorter.printList(head);
    }
}
