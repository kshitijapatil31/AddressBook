package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookOperation {
	AddressBook person=new AddressBook();
	ArrayList<AddressBook>arrayList=new ArrayList<>();
	
	
	
	public void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Name");
		String firstName=sc.next();
		person.setFirstName(firstName);
		
		System.out.println("Enter the Last Name");
		String lastName=sc.next();
		person.setLastName(lastName);
		
		System.out.println("Enter the address");
		String address=sc.next();
		person.setAddress(address);
		
		System.out.println("Enter the city");
		String city=sc.next();
		person.setCity(city);
		
		System.out.println("Enter the state");
		String state=sc.next();
		person.setState(state);
		
		System.out.println("Enter the zip");
		String zip=sc.next();
		person.setEmailId(zip);
		
		System.out.println("Enter the Phone number");
		String phoneNO=sc.next();
		person.setEmailId(phoneNO);
		
		System.out.println("Enter the emailId");
		String emailId=sc.next();
		person.setEmailId(emailId);
		
		arrayList.add(new AddressBook(person.getFirstName(),person.getLastName(),person.getAddress(),person.getCity(),person.getState(),person.getZip(),person.getPhoneNo() ,person.getEmailId()));
	
	
	}
	
	public void print() {
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		AddressBookOperation addressbook=new AddressBookOperation();
		do {
			System.out.println("Enter 1 to add");
			System.out.println("Enter 2 to print");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				addressbook.add();
			case 2:
				addressbook.print();
			}
			
		}while(true);
		
		
			
	}

}
