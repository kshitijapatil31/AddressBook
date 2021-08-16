package com.bridgelabz.addressbook;

import java.util.Scanner;

public class DemoMain {
	Scanner sc =new Scanner(System.in);
	int noOfContact=0;
	int size=sc.nextInt();
	AddressBook array[];
	
	public DemoMain() {
		array=new AddressBook[size];
	}
	private void addContact(AddressBook ad)
			{
			this.array[noOfContact]=ad;
			noOfContact++;
			}
	
	public void printContacts() {
		for (int i=0;i<noOfContact;i++)
			System.out.println(array[i]);
    }
	public static void main(String[] args) {
		DemoMain dm=new DemoMain();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the choice");
		int choice =sc.nextInt();
		//while (choice!=5) {
			if(choice==1) {
				System.out.println("Enter the first name");
				String firstName=sc.nextLine();
				System.out.println("Enter the last name");
				String lastName=sc.nextLine();
				System.out.println("Enter the address");
				String address=sc.nextLine();
				System.out.println("Enter the city");
				String city=sc.nextLine();
				System.out.println("Enter the state");
				String state=sc.nextLine();
				System.out.println("Enter the zip");
				Object zip=sc.nextLine();
				System.out.println("Enter the phine number");
				String phoneNo=sc.nextLine();
				System.out.println("Enter the email");
				String emailId=sc.nextLine();
				
				dm.addContact(new AddressBook(firstName, lastName, address, city, state, zip, phoneNo, emailId));
			
				dm.printContacts();
			}
		}
		
	//}

}
