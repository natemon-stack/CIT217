/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shapeproj;

/**
 *
 * @author Nate
 */
public class ShapeProj {

    public static void main(String[] args) {
        
        Shape shape = new Rectangle("BLUE", 10,5);
        
        System.out.println(shape);
        System.out.println("The Area is: " + shape.getArea());
        
        shape = new Triangle("GREEN", 12, 20);
        
        System.out.println(shape);
        System.out.println("The Area is: " + shape.getArea());
        
    }
       
        
}
