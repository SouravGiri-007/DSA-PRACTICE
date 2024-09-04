/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.w3c.dom.Node;

/**
 *
 * @author sourav
 */
public class ArrToLL {
    class Solution {
    static Node constructLL(int arr[]) {
    if(arr.length == 0){
        return null;
    }

    Node head = new Node(arr[0]);
    Node current = head;
    
    for(int i = 1; i<arr.length; i++){
        current.next = new Node(arr[i]);
        current = current.next;
    }
    return head;
    }
}


}
