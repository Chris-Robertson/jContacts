package com.jcontacts;

import java.io.IOException;
import java.util.Scanner;

class Menu {

    private Scanner keyboard = new Scanner(System.in);

    private ContactsList contactsList = new ContactsList();

    void showMenu() throws IOException {
        menuLoop : while(true) {

            // List of menuItems
            // menuItems.add("1", "Add Contact", () -> addContact();
            // etc

            // menuItems.forEach(item -> print item.index item.description



            System.out.println("###############################################");

            System.out.println("Menu\n");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Quit");
            System.out.printf("\nPlease select an option: ");


            String selection = keyboard.nextLine();

            switch (selection) {
                case "1":
                    addContact();
                    break;

                case "2":
                    displayContacts();
                    break;

                case "3":
                    quitMenu();
                    break menuLoop;

                default:
                    invalidSelction();
                    continue menuLoop;
            }
        }
    }

    private void addContact() throws IOException {
        System.out.printf("\nEnter contact name: ");
        String name = keyboard.nextLine();

        // Check it is a valid name

        System.out.printf("Enter contact phone number: ");
        String phoneNumber = keyboard.nextLine();

        // Check it is a valid 10 digit phone number

        this.contactsList.addContact(name, phoneNumber);

        System.out.println("\nContact added.");
        System.out.println("\nPress ENTER to continue.");
        System.in.read();
    }

    private void displayContacts() throws IOException {
        System.out.println("\nDisplaying contacts:");
        this.contactsList.displayContacts();

        System.out.println("\nPress ENTER to continue.");
        System.in.read();
    }

    private void quitMenu() {
        System.out.println("Please come again.");
    }

    private void invalidSelction() throws IOException {
        System.out.println("\nInvalid selection, try again.");
        System.out.println("\nPress ENTER to continue.");
        System.in.read();
    }
}
