package AddressBooks;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactController {
     private ArrayList<Contact> contacts;
     public ContactController() {
         this.contacts = new ArrayList<>();
     }
     public void addContact(Scanner scanner) {
         System.out.println("\nEnter contact information: ");
         System.out.print("Name: ");
         String name = scanner.nextLine();
         System.out.print("Phone: ");
         String phone = scanner.nextLine();
         System.out.print("Email: ");
         String email = scanner.nextLine();
         System.out.print("Company: ");
         String company = scanner.nextLine();

         contacts.add(new Contact(name, phone, email, company));
         System.out.println("Contact information has been added successfully!");
     }
    public void findContact(Scanner scanner) {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact Found:");
                System.out.println(contact);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found!");
        }
    }
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found in address book.");
            return;
        }

        System.out.println("\nAddress Book Contacts:");
        System.out.println("Contact Name\tCompany\t\tEmail\t\tPhone Number");
        System.out.println("-------------------------------------------------------");
        for (Contact contact : contacts) {
            System.out.printf("%-20s\t%-20s\t%-20s\t%s\n", contact.getName(), contact.getCompany(), contact.getEmail(), contact.getPhone());
        }
    }
    @Override
    public String toString() {
        return String.format("%-20s\t%-15s\t%-20s\t%s", new Object[]{"Name", "Company", "Email", "Phone"});
    }
}
