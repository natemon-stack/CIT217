/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mo1404141_assignment4;

/**
 *
 * @author Nate
 *///Funny enough i had to go search this up named the class product and want it to work as a node
public class Node {
    protected int productId;
    protected String productName; 
    protected int quantity; 
    protected float price; 
    protected Node next;

    public Node(int productId, String productName, int quantity, float price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
    
} 
    

    
