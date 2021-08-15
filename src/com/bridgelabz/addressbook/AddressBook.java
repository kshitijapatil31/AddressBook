package com.bridgelabz.addressbook;

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

		AddressBook addressbook=new AddressBook("rina","sawant","miryabander","Ratnagiri","maharastra",123456,986543210,"abc@mail.com");
	
		addressbook.addContact();
	}

}
