/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mo1404141_assignment3;

/**
 *
 * @author Nate
 */
public class Book extends Item {
    private String author;
    private String genre;

    public Book(String author, String genre, int id, String title) {
        super(id, title);
        this.author = author;
        this.genre = genre;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Author: "+author+",Genre: "+genre+",Title: "+title);
    }
    
}
