package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {

	
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zip;
	int phoneNo;
	String emailId;
	
	public AddressBook(String firstName,String lastName,String address,String city,String state,int zip,int phoneNo,String emailId) {
		this.firstName= firstName;
		this.lastName= lastName;
		this.address= address;
		this.city= city;
		this.state= state;
		this.zip= zip;
		this.phoneNo= phoneNo;
		this.emailId= emailId;
	}
	public  void addContact() {
		System.out.println( firstName+" "+ lastName+" "+address+" "+ city+" "+state+" "+ zip+" "+ phoneNo+" "+ emailId);
	}
	
	public void editContact(String name,String address1,String city1,String state1,int phoneNo1,String emailId1) {
		if(firstName.equals(name)) {
			
			this.address=address1;
			this.phoneNo=phoneNo1;
			this.city=city1;
			this.state=state1;
			this.emailId=emailId1;
			
		}
		System.out.println(firstName+" "+lastName+" "+address+" "+phoneNo+" "+city+" "+state+" "+emailId);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address book Programe");
		System.out.println("Please enter the details :");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the firstName");
		String firstName=sc.nextLine();
		System.out.println("Enter the lastName");
		String lastName=sc.nextLine();
		System.out.println("Enter the address");
		String address=sc.nextLine();
		System.out.println("Enter the city");
		String city=sc.nextLine();
		System.out.println("Enter the state");
		String state=sc.nextLine();
		System.out.println("Enter the phoneNo");
		int phoneNo=sc.nextInt();
		System.out.println("Enter the zip");
		int zip=sc.nextInt();
		System.out.println("Enter the emailId");
		String emailId=sc.nextLine();
		
		AddressBook addressbook=new AddressBook(firstName,lastName,address,city,state,zip,phoneNo,emailId);
	
		addressbook.addContact();
		System.out.println("Enter the name to change contact");
		String name=sc.nextLine();
		System.out.println("Enter the address");
	
		String address1=sc.nextLine();
		System.out.println("Enter the city");
		String city1=sc.nextLine();
		System.out.println("Enter the state");
		String state1=sc.nextLine();
		System.out.println("Enter the phone no");
		int phoneNo1=sc.nextInt();
		System.out.println("Enter the zip");
		int zip1=sc.nextInt();
		System.out.println("Enter the email");
		String emailId1=sc.nextLine();
		
		addressbook.editContact(name,address1,city1,state1,phoneNo1,emailId1);
	}

}
