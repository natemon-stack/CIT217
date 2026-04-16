/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapeproj;

/**
 *
 * @author Nate
 */
public class Triangle extends Shape{

    private int base;
    private int height;
    
 public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
 
 @Override
    public double getArea(){
        return 0.5 * base * height;
    }
    
    @Override
    public String toString(){
        return "Triangle {color: " + getColor() + " base: " + this.base +" height: " + this.height + "}";
             
    }
    
}


