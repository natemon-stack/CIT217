/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradesproject;

/**
 *
 * @author Nate
 */
public class Gradesproject {

    public static void main(String[] args) {
        
        gradeditem Assignment1_CIT217 = new gradeditem("Assignment", 12, 1, 9, 0);
        gradeditem Assignment2_CIT217 = new gradeditem("Assignment", 19, 2, 9, 0);
        
        gradeditemlist gradedlist = new gradeditemlist();
        
        gradedlist.additem(Assignment1_CIT217);
        gradedlist.additem(Assignment2_CIT217);
        
        System.out.println();
        System.out.println(gradedlist);

    }
}
