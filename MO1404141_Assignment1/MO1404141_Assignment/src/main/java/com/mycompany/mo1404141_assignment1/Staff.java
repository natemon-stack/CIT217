/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mo1404141_assignment1;

/**
 *
 * @author Nate
 */
public class Staff extends Employee {
    private String title;

    public Staff(String title, String office, double salary, String datehired, String name, String address, String phonenumber, String email) {
        super(office, salary, datehired, name, address, phonenumber, email);
        this.title = title;
    }
    
    @Override
    public String toString(){
        return"Class: Staff,Name:"+name;
    }
    
    
}
