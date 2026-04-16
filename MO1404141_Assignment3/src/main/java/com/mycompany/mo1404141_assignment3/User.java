/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mo1404141_assignment3;

/**
 *
 * @author Nate
 */
public abstract class User {
    protected int id;
    protected String name;
    protected String studentid;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String name, String studentid) {
        this.name = name;
        this.studentid = studentid;
    }
    
    
    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    

    
    
}
