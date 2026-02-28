/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mo1404141_assignment1;

/**
 *
 * @author Nate
 */
public class Person {
    protected String name;
    protected String address;
    protected String phonenumber;
    protected String email;

    public Person(String name, String address, String phonenumber, String email) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;
    }
    @Override
    public String toString(){
        return"Class: Person,Name:"+name;
    }
                       
}
