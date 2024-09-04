/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.w3c.dom.Node;

/**
 *
 * @author sourav
 */
// problem link = "https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=count-nodes-of-linked-list"
public class CountNode {
class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int count = 0;
        
        Node current = head;
        
        while( current != null){
            count++;
            current = current.next;
        }
        return count;
    }
}
}
