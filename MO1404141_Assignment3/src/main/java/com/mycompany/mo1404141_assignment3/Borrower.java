/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mo1404141_assignment3;

import java.util.ArrayList;

/**
 *
 * @author Nate
 */
public class Borrower extends User {
    private ArrayList<Item> borrowedItems = new ArrayList<>();

    
    public Borrower(int id, String name) {
        super(id, name);
    }
    
    public Borrower(String name, String studentid) {
        super(name, studentid);
    }

    public void borrowItem(Item item){
        borrowedItems.add(item);
        System.out.println("Item is borrowed");
    }

    public void returnItem(Item item){
        if(borrowedItems.remove(item)){
            System.out.println("Item returned");
        } else {
            System.out.println("Item not found");
        }
    }

    public void displayBorrowedItems(){
        if(borrowedItems.isEmpty()){
            System.out.println("No items borrowed");
            return;
        }

        for(Item i : borrowedItems){
            i.displayInfo();
        }
    }

    @Override
    public void displayInfo(){
        System.out.println("Name: " + name);

        if(studentid != null){
            System.out.println("Student ID: " + studentid);
        } else {
            System.out.println("User ID: " + id);
        }

        System.out.println("Borrowed Items:");
        displayBorrowedItems();
    }
}


