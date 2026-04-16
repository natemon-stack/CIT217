/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mo1404141_assignment2;

//Searched this online 
import java.util.ArrayList;

/**
 *
 * @author Nate
 */
public class GradedItemList {
public java.util.ArrayList<Gradeditem> Gradeditem = new java.util.ArrayList<>();

    public ArrayList<Gradeditem> getGradeditem() {
        return Gradeditem;
    }
    public void addItem(Gradeditem item){
        Gradeditem.add(item);
    }
   public double averageGrade(){
        double total = 0;
        for(int i = 0;i<Gradeditem.size();i++){
            total+=Gradeditem.get(i).getGrade();
        }
        return total/Gradeditem.size();
   } 
 
@Override
public String toString(){
        String result = "";
        for(int i = 0;i< Gradeditem.size();i++){
            result+=Gradeditem.get(i)+ "\n";
        }
        return result;  
    }
}