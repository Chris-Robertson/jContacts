import java.util.ArrayList;

public class ContactsList {
    private ArrayList<Contact> contactsList = new ArrayList<>();

    public void displayContacts() {
        for (Contact contact:contactsList) {
            System.out.println(contact.getName() + ' ' + contact.getPhoneNumber());
        }
    }

    public void createContact(String name, String phoneNumber) {
        Contact newContact = new Contact();
        newContact.setName(name);
        newContact.setPhoneNumber(phoneNumber);

        this.contactsList.add(newContact);
    }
}