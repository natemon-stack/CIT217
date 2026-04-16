/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rectangleproject;

/**
 *
 * @author Nate
 */
public class Rectangle {
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
 
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public void viewAttributes(){
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
    
     public double calculatePerimeter(){
        return 2 * (length + width);
    }
    
    public double calculateArea(){
        return length * width;
    }
}
