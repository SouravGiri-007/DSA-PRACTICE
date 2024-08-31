/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author soura
 */

 // problem link = "https://rb.gy/iw6o5d"
public class ImplmByArray {
    class MyStack {
        private int[] arr;
        private int top;
    
        public MyStack() {
            arr = new int[1000];
            top = -1;
        }
    
        public void push(int x) {
          if (top == arr.length - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = x; 
        }
    
        public int pop() {
               if (top == -1) {
               // System.out.println("Stack Underflow");
                return -1;   
            }
            return arr[top--]; 
        }
    }
    
}
