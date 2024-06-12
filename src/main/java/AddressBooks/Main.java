package AddressBooks;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();
        ContactController contactController = new ContactController();

        while (true) {
            System.out.println("\nAddress Book Menu:");
            System.out.println("Please enter your choice: ");
            System.out.println("1. Add New Contact");
            System.out.println("2. Find Contact by Name");
            System.out.println("3. Display Contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("1");
                    break;
                case 3:
                    System.out.println("1");
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
                }
            }
        }
        public static void addContact(ArrayList<Contact> contacts, Scanner scanner) {
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
    public void findContact(Scanner scanner, Contact[] contacts) {
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
    public static void displayContacts(ArrayList<Contact> contacts) {
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
    }