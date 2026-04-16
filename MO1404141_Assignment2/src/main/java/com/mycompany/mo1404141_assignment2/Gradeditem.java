/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mo1404141_assignment2;

/**
 *
 * @author Nate
 */
public class Gradeditem {
     protected String name;
    protected double grade;
    protected int month;
    protected int day;
    protected int hour;
    protected int minute;

    public Gradeditem(String name, double grade, int month, int day, int hour, int minute) {
        this.name = name;
        this.grade = grade;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.grade = 0;
    }
    public String getName(){return name;}
    public int getMonth(){return month;}
    public int getDay(){return day;}
    public int getHour(){return hour;}
    public int getMinute(){return minute;}
    public double getGrade(){return grade;}
    public void setGrade(double grade){
    this.grade = grade;
    }

    @Override
    public String toString() {
        return "Gradeditem{" + "name=" + name + ", grade=" + grade + ", month=" + month + ", day=" + day + ", hour=" + hour + ", minute=" + minute + '}';
    }
    

   
    
   
}
