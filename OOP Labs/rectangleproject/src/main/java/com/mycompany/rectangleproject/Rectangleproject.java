/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangleproject;

/**
 *
 * @author Nate
 */
public class Rectangleproject {

    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle(10,5);
        
        System.out.println("Initial attributes:");
        rect.viewAttributes();
        
        rect.setLength(8);
        rect.setWidth(3);

        System.out.println("After modification:");
        rect.viewAttributes();
        
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        System.out.println("Area: " + rect.calculateArea());
    }
}
       