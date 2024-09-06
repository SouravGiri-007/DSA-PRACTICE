/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sourav
 */

 // problem link = "https://leetcode.com/problems/linked-list-cycle/description/"
public class Detect_Cycle {
    public class Solution {
        public boolean hasCycle(ListNode head) {
            // Initialize two pointers, slow and fast
            ListNode slow = head;
            ListNode fast = head;
    
            // Traverse the list using the two pointers
            while (fast != null && fast.next != null) {
                slow = slow.next;           // Move slow pointer one step
                fast = fast.next.next;      // Move fast pointer two steps
    
                // If slow and fast meet, a cycle exists
                if (slow == fast) {
                    return true;
                }
            }
    
            // If we exit the loop, no cycle exists
            return false;
        }
    }
}
