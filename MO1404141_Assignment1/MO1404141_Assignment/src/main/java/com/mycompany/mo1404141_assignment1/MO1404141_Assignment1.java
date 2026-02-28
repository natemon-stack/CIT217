/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mo1404141_assignment1;

/**
 *
 * @author Nate
 */
public class MO1404141_Assignment1 {

    public static void main(String[] args) {
        
        Stock stock1 = new Stock("ORCL","Oracle Corporation",10000,12000);
        stock1.setPreviousClosingPrice(34.5);
        stock1.setCurrentPrice(34.35);
        
        System.out.println(stock1);
        System.out.println("Price Percentage:" +stock1.getChangePercent()+"%");
        
        Person person = new Person ("Nolan John", "Gros Islet", "7589901234","nolanj@gmail.com");
        Student student = new Student(Student.SENIOR,"Nathan Montoute","Bexon","7584551234","nathanmon@gmail.com");
        Employee employee = new Employee ("Office 001",5000,"01/08/2000","Paul John","Castries","7581234567","johnp@gmail.com");
        Faculty faculty = new Faculty ("12:00 - 1:00","Rank 09","Office 009",9000,"09/10/26","Mr. Smith","V.Fort","7583337867","smittysmith@gmail.com");
        Staff staff = new Staff("Teacher","Office 010",6300,"07/05/2024","Ela Jn.Pierre","Dennery","7584563344","jnpierreela@gmail.com");
        
        System.out.println("Person Structure");
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
        
        
    }

}
