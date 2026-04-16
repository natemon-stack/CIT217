/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stackproject;

/**
 *
 * @author Nate
 */
public class Stack {
    private Node top;
    private int count;

   public Stack(){
       top = null;
       count = 0;
   }
   
   public void push(String value){
       Node newNode = new Node(value);
       newNode.next = top;
       top = newNode;
       count++;
   }
   
   public String pop(){
       if(top == null){
           System.out.println("Error, Stack is empty");
           return null;
       }
       String poppedValue = top.data;
       top = top.next;
       count--;
       return poppedValue;
   }
   
   public boolean isEmpty(){
       return top == null;
   }
   
   public String peek(){
       if(isEmpty()){
           return null;
       }
       return top.data;
   }
   
   public int size(){
       return count;
   }
   
   public void displayStack(){
       Node current = top;
       while (current != null){
        System.out.println(current.data);
        current = current.next;
   }
   }
    
    
}
