/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapeproj;

/**
 *
 * @author Nate
 */
public class Shape {
    
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea(){
        System.out.println("No Shape defined...");
        return 0;
    }

    public Shape(String color) {
        this.color = color;
    }
    
    @Override 
    public String toString(){
        return "Shape: {color: "+ this.color + "}";
    }
    

  
    
    
    
}
