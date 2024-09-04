/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sourav
 */

//  problem link= "https://leetcode.com/problems/reverse-linked-list/"
public class ReverseList {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode curr= head;
            ListNode prev = null;
    
            while(curr != null){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
    
            }
            return prev;
        }
    }
}
