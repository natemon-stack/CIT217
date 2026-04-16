/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stackproject;

import java.util.Scanner;

/**
 *
 * @author Nate
 */
public class StackProject {

    public static void main(String[] args) {
        
    Stack stack = new Stack();
    Scanner scanner = new Scanner(System.in);
    int choice;
   
    do {
        System.out.println("");
        System.out.println("******** MENU ********");
        System.out.println("1 - Push");
        System.out.println("2 - Pop");
        System.out.println("3 - Stack Size");
        System.out.println("4 - Top of the Stack");
        System.out.println("5 - Display Stack");
        System.out.println("6 - Quit");
        System.out.println("**********************");

        System.out.print("Enter option: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){

            case 1:
                System.out.print("Enter value: ");
                String value = scanner.nextLine();
                stack.push(value);
                break;

            case 2:
                String popped = stack.pop();
                if (popped == null) {
                System.out.println("Stack is empty!");
                } else {
                    System.out.println("Popped: " + popped);
                }
                break;

            case 3:
                System.out.println("Stack size: " + stack.size());
                break;

            case 4:
                String top = stack.peek();
                if (top == null) {
                    System.out.println("Stack is empty!");
                } else {
                    System.out.println("Top: " + top);
                }
                break;

            case 5:
                System.out.println("Stack contents:");
                stack.displayStack();
                break;

            case 6:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid option!");
        }

    } while ( choice != 6);

    }
}

