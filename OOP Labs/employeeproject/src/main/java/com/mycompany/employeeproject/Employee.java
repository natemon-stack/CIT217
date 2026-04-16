/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeeproject;

/**
 *
 * @author Nate
 */
public class Employee {
    private String name;
    private double salary;
    
    public Employee(){
        name = "unassigned";
        salary = 0.0;
    }
    
    public Employee(String newName, double newSalary){
        name = newName;
        salary = newSalary;
    }
    
    public void setName( String newName){
            name = newName;    
    }
    
    public void setSalary(double newSalary){
        salary = newSalary;
    }
     
    public String getName(){
         return name;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void calculateNewSalary(double percentage){
        
        double tempSalary = calculateSalary(percentage);
        
        if (tempSalary == -1){
            System.out.println("The percentage is out of boundaries...");
        }else
            salary = tempSalary;
    
    if ( percentage >= 0 && percentage <=100 ){
    salary = salary + salary * percentage;
     System.out.println("The new salary was updated. New salary is: " + salary );
    }else {
     System.out.println("The percentage is out of boundaries...");
    }
}
public double calculateSalary(double percentage){
    
    if (percentage >= 0 && percentage <=100){
        return salary + salary * percentage;
    }else {
    return -1;
 }
}
}

