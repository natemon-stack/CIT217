/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookproject;

/**
 *
 * @author Nate
 */
public class BookProject {
    
    public static void main(String[] args){
        
        Book def_book = new Book();
        System.out.println("Default Constructor: " + def_book.toString());
        
        Book param_book = new Book("Introd to OOP Programming", "John Doe", 50.00);
        System.out.println("Parameters Constructors: " + param_book.toString());
        
        Book copy_book = new Book(param_book);
        copy_book.setAuthor("John Doe");
        copy_book.setTitle("Introd to OOP Programming");
        copy_book.setPrice(50.00);

    }
}
