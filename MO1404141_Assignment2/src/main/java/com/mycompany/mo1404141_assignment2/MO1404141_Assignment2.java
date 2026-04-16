/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mo1404141_assignment2;

/**
 *
 * @author Nate
 */
public class MO1404141_Assignment2 {

    public static void main(String[] args) {
        GradedItemList List = new GradedItemList();
        Exam finalExam = new Exam("Final","final.pdf",0.78,12,13,8,0);
        finalExam.setGrade(0.78);
        Assignment lab1 = new Assignment("calendar.csv","lab1.pdf","Lab 1",0.50,8,26,23,59);
        lab1.setGrade(0.50);
        
        List.addItem(finalExam);
        List.addItem(lab1);

        System.out.println(List);
        System.out.println("Average: "+List.averageGrade());
    }
    
}
