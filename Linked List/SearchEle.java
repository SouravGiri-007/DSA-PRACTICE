/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.w3c.dom.Node;

/**
 *
 * @author soura
 */
public class SearchEle {
         static boolean searchKey(int n, Node head, int key) {
       Node temp = head;

        // Traverse the linked list
        while (temp != null) {
            // Check if the current node's data is equal to the desired element
            if (temp.data == key)
                return true;  // Return 1 if the element is found

            // Move to the next node
            temp = temp.next;
        }

        return false; 
    }
}
