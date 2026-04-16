/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mo1404141_assignment2;

/**
 *
 * @author Nate
 */
public class Assignment extends Gradeditem {
   public String specification;
   public String data;

    public Assignment(String specification, String data, String name, double grade, int month, int day, int hour, int minute) {
        super(name, grade, month, day, hour, minute);
        this.specification = specification;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Assignment{" + "specification=" + specification + ", data=" + data + '}';
    }
    
    
    
    
}
