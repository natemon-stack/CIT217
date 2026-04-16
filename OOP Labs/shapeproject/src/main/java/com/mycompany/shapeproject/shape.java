/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapeproject;

/**
 *
 * @author Nate
 */
public class shape {
    protected String color;
    protected Point location;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public shape(String color, Point location) {
        this.color = color;
        this.location = location;
    }
    
     public double area(){
         return 0;
         
     }
    
     public double parameter(){
         return 0;
     }
}
