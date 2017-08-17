package com.jcontacts;

import java.util.ArrayList;

class ContactsList {
    private ArrayList<Contact> contactsList = new ArrayList<>();

    void displayContacts() {
        contactsList.forEach(contact ->
            System.out.println(contact.getName() + " : " + contact.getPhoneNumber()));
    }

    void addContact(String name, String phoneNumber) {
        Contact newContact = new Contact();
        newContact.setName(name);
        newContact.setPhoneNumber(phoneNumber);

        this.contactsList.add(newContact);
    }
}