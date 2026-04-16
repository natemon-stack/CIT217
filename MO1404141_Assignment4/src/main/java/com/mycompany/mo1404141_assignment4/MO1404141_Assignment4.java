/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mo1404141_assignment4;

import java.util.Scanner;

/**
 *
 * @author Nate
 */
public class MO1404141_Assignment4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Inventory inventory = new Inventory();
        
        int choice;
        
        do{
            System.out.println("\n*****MENU*****");
            System.out.println("1. Add Product");
            System.out.println("2. Display Product");
            System.out.println("3. Search Product");
            System.out.println("4. Update Stock Quantity");
            System.out.println("5. Delete Product");
            System.out.println("6. Total Value");
            System.out.println("7. Quit");
            System.out.println("***********");
            System.out.print("Enter Choice: ");
            
            choice = input.nextInt();
            
            if (choice == 1) {
                System.out.print("Enter ID: ");
                int productId = input.nextInt();

                System.out.print("Enter Name: ");
                String name = input.next();

                System.out.print("Enter Quantity: ");
                int quantity = input.nextInt();

                System.out.print("Enter Price: $");
                float price = input.nextFloat();

                inventory.Node(productId, name, quantity, price);
                System.out.println("Product added");
        
            } 
             else if (choice == 2) {
                inventory.display();
            }
            else if (choice == 3) {
                System.out.print("Enter ID: ");
                inventory.search(input.nextInt());
            }
            else if (choice == 4) {
                System.out.print("Enter ID: ");
                int productId = input.nextInt();

                System.out.print("Enter New Quantity: ");
                int quantity = input.nextInt();
                inventory.update(productId, quantity);
                System.out.println("Product Updated");
            }
             else if (choice == 5) {
                System.out.print("Enter ID: ");
                inventory.delete(input.nextInt());
                System.out.println("Product Deleted");
             }
            else if (choice == 6) {
                inventory.totalValue();
            }
            else if (choice == 7) {
                System.out.println("Exiting System");
            }
             else {
                System.out.println("Choice not valid");
            }
            
        } while(choice != 7);
    }
                   
}