/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gradesproject;

import java.util.ArrayList;

/**
 *
 * @author Nate
 */
public class gradeditemlist {
    private ArrayList gradeditemlist;

    public gradeditemlist(){
        
        gradeditemlist = new ArrayList<gradeditem>();   
    }
    
    public void additem(gradeditem item){
        gradeditemlist.add(item);
    }
    
    @Override
    public String toString(){
        
        String strList = "";
        
        for(int i = 0; i < gradeditemlist.size(); i++){
            strList = strList.concat(gradeditemlist.get(i).toString());
            
        }
        return strList;
    }
}