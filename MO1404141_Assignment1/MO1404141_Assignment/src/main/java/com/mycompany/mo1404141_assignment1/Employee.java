/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mo1404141_assignment1;

/**
 *
 * @author Nate
 */
public class Employee extends Person {
    protected String office;
    protected double salary;
    protected String datehired;

    public Employee(String office, double salary, String datehired, String name, String address, String phonenumber, String email) {
        super(name, address, phonenumber, email);
        this.office = office;
        this.salary = salary;
        this.datehired = datehired;
    }
    
    @Override
    public String toString(){
        return"Class:Employee,Name:"+name;
    }
    
    
}
