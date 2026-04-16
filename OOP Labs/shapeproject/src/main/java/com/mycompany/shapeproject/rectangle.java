/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapeproject;

/**
 *
 * @author Nate
 */
public class rectangle extends shape {
    
    private int width;
    private int height;

    public rectangle(int width, int height, String color, Point location) {
        super(color, location);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    @Override
    public double area(){
         return width * height;
         
    }
    
   @Override
     public double parameter(){
         return 2 * width + 2 * height;

    }
}
