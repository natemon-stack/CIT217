/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shapeproject;

/**
 *
 * @author Nate
 */
public class Shapeproject {

    public static void main(String[] args) {
        
     rectangle r = new rectangle(5, 10);
     circle c = new circle(7);
        
     System.out.println("Rectangle Area: " + r.area());
        System.out.println("Rectangle Perimeter: " + r.parameter());

        System.out.println("Circle Area: " + c.area());
        System.out.println("Circle Perimeter: " + c.parameter());
    }

}
