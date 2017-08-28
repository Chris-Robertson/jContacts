package com.jcontacts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Menu {

    private Scanner keyboard = new Scanner(System.in);

    private ContactsList contactsList = new ContactsList();

    void showMenu() throws IOException {
        menuLoop : while(true) {

            ArrayList<MenuItem> menuItems = new ArrayList<>();

            menuItems.add("1", "Add Contact", () -> addContact());
            menuItems.add("2", "Display Contacts", () -> displayContacts());
            menuItems.add("3", "Quit", () -> quitMenu());

            menuItems.forEach(item -> System.out.println(item.getIndex() + ". " + item.getDescription());

            String selection = keyboard.nextLine();

            if (menuItems.contains(selection)) {
                menuItems.get(Integer.parseInt(selection)).getRunMethod();
            }
            else invalidSelction();
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
