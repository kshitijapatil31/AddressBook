package com.bridgelabz.addressbook;

import java.util.ArrayList;

import java.util.Scanner;

public class AddressBookOperation {
	AddressBook person=new AddressBook();
	ArrayList<AddressBook>arrayList=new ArrayList<>();
	
	
	
	public void add(AddressBook p) {
	
	  arrayList.add(p);
	  String name=p.getFirstName()+p.getLastName();
	    for(int i=0;i<arrayList.size();i++) {
		AddressBook detail=arrayList.get(i);
		String contactName=detail.getFirstName()+detail.getLastName();
		if(contactName.equals(name)) {
			System.out.println("Sorry! this contact is already exit");
		     return;
		}
	}
		
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
			System.out.println("/******MENU********/");
			System.out.println("Enter 1 to add");
			System.out.println("Enter 2 to print");
			System.out.println("/**************/");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the First Name");
				String firstName=sc.next();
				
				
				System.out.println("Enter the Last Name");
				String lastName=sc.next();
				
				
				System.out.println("Enter the address");
				String address=sc.next();
				
				
				System.out.println("Enter the city");
				String city=sc.next();
				
				
				System.out.println("Enter the state");
				String state=sc.next();
				
				
				System.out.println("Enter the zip");
				String zip=sc.next();
				
				
				System.out.println("Enter the Phone number");
				String phoneNo=sc.next();
				
				
				System.out.println("Enter the emailId");
				String emailId=sc.next();
				
				addressbook.add(new AddressBook(firstName,lastName,address,city,state,zip,phoneNo,emailId));
			
			case 2:
				addressbook.print();
			}
			
		}while(true);
		
		
			
	}

}
