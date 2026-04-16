/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mo1404141_assignment4;

/**
 *
 * @author Nate
 */
public class Inventory {
    
    Node head;

    public Inventory() {
        this.head = null;
    }    
    
    public void Node(int productId, String productName, int quantity, float price){
        Node node = new Node(productId, productName,  quantity, price); 
        node.productId = productId;
        node.productName = productName;
        node.quantity = quantity;
        node.price = price;
        node.next = head;
        node.next=null;
        head = node;
        
        
        if (head == null){
            head = node;
            return;
        }
       
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = node;
    }
    
    public void display(){
        Node current = head;
        
        if(current == null){
            System.out.println("Inventory Empty");
            return;
        }
        while(current != null){
            System.out.println("Id: "+current.productId +
                    "Name: " + current.productName +
                    "Quantitiy: " + current.quantity +
                    "Price: " + current.price);
            current = current.next;
        }
    }
    public void search(int productId){
        Node current = head;
        
        while(current != null){
            if(current.productId == productId){
                System.out.println("Found Product");
                System.out.println("ID: " + current.productId);
                System.out.println("Name: " + current.productName);
                System.out.println("Quantity: " + current.quantity);
                System.out.println("Price: $" + current.price);
                return;   
            }
            current = current.next;
        }
    }
    
    public void update(int productId, int quantity){
        Node current = head;
        
        while(current != null){
            if(current.productId == productId){
                current.quantity = quantity;
                System.out.println("Stock quantity updated");
                return;
            }
            current = current.next;
        }
    }
   public void delete(int productId){
       if(head == null){
           System.out.println("Empty");
           return;
           
   }
       if(head.productId == productId){
           head = head.next;
           System.out.println("Product deleted");
           return;
       }
       
       Node current = head;
       
       while(current.next != null){
           if(current.next.productId== productId){
              current.next = current.next.next;
              System.out.println("Product deleted");
              return;
           }
           current = current.next;
       }
   }    
   public void totalValue(){
       Node current = head;
       double total = 0;
       
       while(current != null){
       total += current.price * current.quantity;
       current = current.next; 
   }
       System.out.println("Total Value: $" + total);
    }
}
