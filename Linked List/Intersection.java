public class Intersection {
    public class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
         }
        
       public class Solution {
           public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
               if(headA == null || headB == null){
                   return null;
       
               }
       
               ListNode A = headA;
               ListNode B = headB;
       
               while(A != B){
                   if(A == null && B == null){
                       return null;
                   }else if(A == null){
                       A = headB;
                   }else if(B == null){
                       B = headA;
                   }else{
                       A = A.next;
                       B = B.next;
                   }
                 
               }
               return A;
           }
       }
}
