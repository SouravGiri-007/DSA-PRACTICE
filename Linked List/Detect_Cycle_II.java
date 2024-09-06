
/**

 * @author sourav
 */
public class Detect_Cycle_II {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode first = head;
        while(first != null && first.next != null){
            slow = slow.next;
            first = first.next.next;
            if(first == slow) return firstNode(head,first);

        }
        return null;
    }
    private ListNode firstNode(ListNode head , ListNode first){
        while(first != head){
            first = first.next;
        head = head.next;
        }
         return head;
    }
   

}
