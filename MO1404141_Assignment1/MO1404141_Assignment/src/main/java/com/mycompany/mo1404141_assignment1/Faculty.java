/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mo1404141_assignment1;

/**
 *
 * @author Nate
 */
public class Faculty extends Employee {
    private String officehours;
    private String rank;

    public Faculty(String officehours, String rank, String office, double salary, String datehired, String name, String address, String phonenumber, String email) {
        super(office, salary, datehired, name, address, phonenumber, email);
        this.officehours = officehours;
        this.rank = rank;
    }
    
    @Override
    public String toString(){
        return"Class: Faculty,Name:"+name;
                
    }
    
}
