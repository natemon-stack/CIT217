/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mo1404141_assignment2;

/**
 *
 * @author Nate
 */
public class Exam extends Gradeditem {
    public String problemSet;

    public Exam(String problemSet, String name, double grade, int month, int day, int hour, int minute) {
        super(name, grade, month, day, hour, minute);
        this.problemSet = problemSet;
    }

    @Override
    public String toString() {
        return "Exam{" + "problemSet=" + problemSet + '}';
    }
    
    
    
}
