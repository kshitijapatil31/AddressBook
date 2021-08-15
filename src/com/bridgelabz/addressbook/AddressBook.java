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
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address book Programe");
		System.out.println("Please enter the details :");
		Scanner sc=new Scanner(System.in);
		String firstName=sc.nextLine();
		String lastName=sc.nextLine();
		String address=sc.nextLine();
		String city=sc.nextLine();
		String state=sc.nextLine();
		int phoneNo=sc.nextInt();
		int zip=sc.nextInt();
		String emailId=sc.nextLine();
		
		AddressBook addressbook=new AddressBook(firstName,lastName,address,city,state,zip,phoneNo,emailId);
	
		addressbook.addContact();
		
	}

}
