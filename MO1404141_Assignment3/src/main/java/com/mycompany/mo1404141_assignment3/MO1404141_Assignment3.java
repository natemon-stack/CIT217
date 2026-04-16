/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mo1404141_assignment3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nate
 */
public class MO1404141_Assignment3 {
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Borrower> borrowers = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public void addUser(User user){
        borrowers.add((Borrower) user);
    }

    public Item searchItem(String title){
        for(Item i : items){
            if(i.getTitle().equals(title)){
            return i;
            }
        }
        return null;
    }

    public Borrower searchBorrower(String name){
        for(Borrower b : borrowers){
            if(b.getName().equals(name)){
            return b;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        MO1404141_Assignment3 lib = new MO1404141_Assignment3();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
             System.out.println("*****MENU*****");
            System.out.println("\n1. Add User");
            System.out.println("2. Add Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Search User");
            System.out.println("7. Quit");
             System.out.println("***********");
             
            choice = input.nextInt();
            input.nextLine(); // clear buffer

            switch(choice){
            case 1:
            System.out.print("Enter name: ");
            String name = input.nextLine();

            System.out.print("Enter numeric ID: ");
            int id = input.nextInt();
            input.nextLine();

            lib.addUser(new Borrower(id, name));
            break;

            case 2:
            System.out.print("Enter id: ");
            int bookId = input.nextInt();
            input.nextLine();

            System.out.print("Enter title: ");
            String title = input.nextLine();

            System.out.print("Enter author: ");
            String author = input.nextLine();

            System.out.print("Enter genre: ");
            String genre = input.nextLine();

            lib.addItem(new Book( author, genre, bookId, title));
            break;

            case 3:
            System.out.print("Enter user name: ");
            String borrowerName = input.nextLine();

            System.out.print("Enter book title: ");
            String borrowTitle = input.nextLine();

            Borrower b = lib.searchBorrower(borrowerName);
            Item i = lib.searchItem(borrowTitle);

            if (b != null && i != null) {
            b.borrowItem(i);
            }else {
            System.out.println("User or Book not found.");
            }
            break;

            case 4:
            System.out.print("Enter user name: ");
            String returnName = input.nextLine();

            System.out.print("Enter book title: ");
            String returnTitle = input.nextLine();

            Borrower br = lib.searchBorrower(returnName);
            Item it = lib.searchItem(returnTitle);

            if (br != null && it != null) {
                br.returnItem(it);
                }else {
                System.out.println("User or Book not found.");
                }
            break;

            case 5:
            System.out.print("Enter title: ");
            String searchTitle = input.nextLine();

            Item item = lib.searchItem(searchTitle);
            if(item != null){
                item.displayInfo();
            } else {
                System.out.println("Book not found.");
            }
            break;

            case 6:
            System.out.print("Enter name: ");
            String searchName = input.nextLine();

            Borrower user = lib.searchBorrower(searchName);

            if(user != null){
                user.displayInfo();
            }else {
                System.out.println("User not found.");
            }
                    
            break;

            case 7:
            System.out.println("Exiting program...");
            break;

            default:
            System.out.println("Invalid choice.");
            }

        } while(choice != 7);
    }
}                 