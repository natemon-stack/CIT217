/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapeproj;

/**
 *
 * @author Nate
 */
public class Rectangle extends Shape {
    
    private int length;
    private int width;

    public Rectangle( String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    @Override
    public double getArea(){
        return length * width;
    }
    
    @Override
    public String toString(){
        return"Rectangle {color: " +getColor() + " length: " + this.length +" width: " +this.width+ "}";
             
    }
    
}
