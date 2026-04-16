/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gradesproject;

/**
 *
 * @author Nate
 */
public class gradeditem {
    private String name;
    private double grade;
    private int month;
    private int day;
    private int hour;
    private int minute;

public gradeditem(String name, int month, int day, int hour, int minute){
    this.name = name;
    this.month = month;
    this.day = day;
    this.hour = hour;
    this.minute = minute;
    }
    public String getName() {
    return name;
    }
    
    public double getGrade() { 
    return grade;
    }
    
    public int getMonth() {
    return month;
    }
    
    
    
}
