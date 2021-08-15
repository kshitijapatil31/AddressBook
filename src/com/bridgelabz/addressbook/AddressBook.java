package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {

	
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	Object zip;
	String phoneNo;
	String emailId;
	
	public AddressBook(String firstName,String lastName,String address,String city,String state,int zip,String phoneNo,String emailId) {
		this.firstName= firstName;
		this.lastName= lastName;
		this.address= address;
		this.city= city;
		this.state= state;
		this.phoneNo= phoneNo;
		this.zip= zip;
		this.emailId= emailId;
	}
	public  void addContact() {
		System.out.println( firstName+" "+ lastName+" "+address+" "+ city+" "+state+" "+ zip+" "+ phoneNo+" "+ emailId);
	}
	
	public void editContact(String name,String address1,String city1,String state1,String phoneNo1,String emailId1) {
		if(firstName.equals(name)) {
			
			this.address=address1;
			this.phoneNo=phoneNo1;
			this.city=city1;
			this.state=state1;
			this.emailId=emailId1;
			
		}
		System.out.println(firstName+" "+lastName+" "+address+" "+phoneNo+" "+city+" "+state+" "+emailId);
		
	}
	public void deleteContact(String deletename){
		if(deletename.equals(firstName)) {
			
			this.firstName= null;
			this.lastName= null;
			this.address=  null;
			this.city=  null;
			this.state=  null;
			this.phoneNo=   null;
			this.zip=  null;
			this.emailId=  null;
			System.out.println("After delete"+firstName+" "+lastName+" "+address+" "+phoneNo+" "+city+" "+state+" "+emailId);
		}
		
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
		System.out.println("Enter the emailId");
		String emailId=sc.nextLine();
		System.out.println("Enter the phoneNo");
		String phoneNo=sc.nextLine();
		System.out.println("Enter the zip");
		int zip=sc.nextInt();
		
		
		AddressBook addressbook=new AddressBook(firstName,lastName,address,city,state,zip,phoneNo,emailId);
	
		addressbook.addContact();
		System.out.println("Enter the name to delete contact");
		
		String name=sc.next();
		addressbook.deleteContact(name);
		/*System.out.println("Enter the name to change contact");
		String name=sc.nextLine();
		
		System.out.println("Enter the address");
	    String address1=sc.nextLine();
	    
		System.out.println("Enter the city");
		String city1=sc.nextLine();
		
		System.out.println("Enter the state");
		String state1=sc.nextLine();
		
		System.out.println("Enter the email");
		String emailId1=sc.nextLine();
		
		System.out.println("Enter the phone no");
		String phoneNo1=sc.nextLine();
		
		System.out.println("Enter the zip");
		int zip1=sc.nextInt();*/
		
		//addressbook.editContact(name,address1,city1,state1,phoneNo1,emailId1);;
		
		//System.out.println("Enter the name to delete contact");
		
		
		
		
	
	}

}
