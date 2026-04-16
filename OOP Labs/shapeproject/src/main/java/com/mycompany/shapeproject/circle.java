/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapeproject;

/**
 *
 * @author Nate
 */
public class circle extends shape {
    
    private int radius;

    public circle(int radius, String color, Point location) {
        super(color, location);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

     @Override
    public double area(){
        
         return Math.PI * Math.pow(radius, 2);
         
     }
    
    @Override
     public double parameter(){
         return 2 * Math.PI * radius;
     }   
    
}
