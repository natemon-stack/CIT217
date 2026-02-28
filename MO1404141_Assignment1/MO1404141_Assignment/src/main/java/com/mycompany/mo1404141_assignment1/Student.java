/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mo1404141_assignment1;

/**
 *
 * @author Nate
 */
public class Student extends Person {
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;
    
    private int status;

    public Student(int status, String name, String address, String phonenumber, String email) {
        super(name, address, phonenumber, email);
        this.status = status;
    }
    
    @Override
    public String toString(){
        return"Class: Student,Name:"+name;
    }
            
            

    
    
    
}
