/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.employeeproject;

/**
 *
 * @author student
 */
public class Employeeproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Employee employee_1 = new Employee();
        System.out.println("employee_1 Object: " + employee_1.getName());
        System.out.println("employee_1 Object: " + employee_1.getSalary());
        
        Employee employee_2 = new Employee("John Doe", 2000.0);
        System.out.println("employee_2 Object: " + employee_2.getName());
        System.out.println("employee_2 Object: " + employee_2.getSalary());
        
    }
    
}
