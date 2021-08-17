package com.bridgelabz.addressbook;

import java.util.Scanner;

public class DemoMain {
	Scanner sc = new Scanner(System.in);
	int noOfContact = 0;

	int size = sc.nextInt();
	AddressBook array[];

	public DemoMain() {
		array = new AddressBook[size];
	}

	private void addContact(AddressBook ad) {
		this.array[noOfContact] = ad;
		noOfContact++;
	}

	public void printContacts() {
		for (int i = 0; i < noOfContact; i++)
			System.out.println(array[i]);
	}

	public int haveContact(String s) {
		for (int i = 0; i < noOfContact; i++)
			if (array[i].getFirstName().equals(s))
				return i;

		return -1;

	}

	public void deleteContact(String s) {
		int dlt = haveContact(s);
		if (dlt >= 0) {
			array[dlt] = array[noOfContact - 1];

			noOfContact--;

			array[noOfContact]=array[noOfContact-1];

		}
	}

	
public static void menu() {
	System.out.println(/***********************/);
	System.out.println("Enter the choice 1 to add contact");
	System.out.println("Enter the choice 2 to remove contact");
	System.out.println("Enter the choice 3 to display contact");
	
}
	public static void main(String[] args) {
		DemoMain dm = new DemoMain();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice");
		int choice = sc.nextInt();

		System.out.println("how many persons u want to add in addressBook");
		int num=sc.nextInt();

		while (choice != 5) {
			
			if (choice == 1) {
				

				for(int i=0;i<num;i++) {

				System.out.println("Enter the first name");
				String dummy=sc.nextLine();
				String firstName = sc.nextLine();
				System.out.println("Enter the last name");
				String lastName = sc.nextLine();
				System.out.println("Enter the address");
				String address = sc.nextLine();
				System.out.println("Enter the city");
				String city = sc.nextLine();
				System.out.println("Enter the state");
				String state = sc.nextLine();
				System.out.println("Enter the zip");
				Object zip = sc.nextLine();
				System.out.println("Enter the phone number");
				String phoneNo = sc.nextLine();
				System.out.println("Enter the email");
				String emailId = sc.nextLine();

				
				
				dm.addContact(new AddressBook(firstName, lastName, address, city, state, zip, phoneNo, emailId));

				}

				//dm.printContacts();

				
			}
			 else if (choice == 2) {
				System.out.println("Enter the name to delete contact");
				String name = sc.nextLine();
				String dummy=sc.nextLine();

				dm.deleteContact(name);

			} else if (choice == 3) {

				dm.printContacts();

			}
			else if (choice != 5) {
				System.out.println("Enter the correct choice");
			}
			menu();
			choice = sc.nextInt();
		}

	
		
	}


}


