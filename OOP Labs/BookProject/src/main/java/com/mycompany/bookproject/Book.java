/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookproject;

/**
 *
 * @author Nate
 */
public class Book {
    private String Author;
    private String Title;
    private double Price;
    
    public Book(){
        Title ="";
        Author ="";
        Price = 0.0;
    }
    
    public Book(String Author, String Title, double Price) {
        this.Author = Author;
        this.Title = Title;
        this.Price = Price;
    }
    
    public Book(Book Book){
        this.Title = Book.Title;
        this.Author =Book.Author;
        this.Price =Book.Price;
    }
    
    public String getTitle(){
        return Title;
    }
    
    public void setTitle(String Title){
        this.Title = Title;
    }
    
    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    public String toString(){
        return"Title: " + Title +
              "Author: " + Author +
              "Price: " + Price;
    }
    
}
