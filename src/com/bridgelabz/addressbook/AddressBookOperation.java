package com.bridgelabz.addressbook;

import java.util.ArrayList;

import java.util.Scanner;

public class AddressBookOperation {
	AddressBook person=new AddressBook();
	ArrayList<AddressBook>arrayList=new ArrayList<>();
	String search=null;
	
	
	public void add(AddressBook p) {
	
	
	  String name=p.getFirstName()+p.getLastName();
	    for(int i=0;i<arrayList.size();i++) {
		AddressBook detail=arrayList.get(i);
		String contactName=detail.getFirstName()+detail.getLastName();
		if(contactName.equals(name)) {
			System.out.println("Sorry! this contact is already exit");
		     return;
		}
	}
	    arrayList.add(p);
	}
	public AddressBook searchByCity(String cityName) {
		
		
		for(AddressBook obj:arrayList) {
			if(obj.getCity()==cityName) {
				person=obj;
			}
		}
		return person;
		
	}
	public AddressBook personCityState(String Name){
	
	for(AddressBook obj:arrayList) {
			if(obj.getCity()==Name) {
				person=obj;
			}else if(obj.getState()==Name){
				person=obj;
			}
		}
		return person;
	}
	private int noOfContact(String name) {
		int cityCount=0,stateCount=0;
	
		for(int i=0;i<arrayList.size();i++) {
			if(arrayList.contains(name)) {
				cityCount++;
				return cityCount;
			}else if(arrayList.contains(name)) {
				
					stateCount++;
					return stateCount;
			}
		}
		return 0;
		
	}
	public void print() {
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
	}
	
	public static void main(String[] args) {
		ArrayList<AddressBook>arrayList=new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		AddressBookOperation addressbook=new AddressBookOperation();
		do {
			System.out.println("/******MENU********/");
			System.out.println("Enter 1 to add");
			System.out.println("Enter 2 to print");
			System.out.println("Enter 3 to search");
			System.out.println("Enter 4 to view person by city or state ");
			System.out.println("Enter 5 to get number of contact by city or state ");
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
				
				addressbook.add(new AddressBook(firstName,lastName,address,city,state,zip,phoneNo,emailId,arrayList));
			      break;
			case 2:
				addressbook.print();
				  break;
			case 3:
				System.out.println("Enter the city name which u want to search");
				String cityName=sc.next();
				AddressBook cityobj=addressbook.searchByCity(cityName);
				
				System.out.println("The person is:");
                System.out.println("First Name:"+cityobj.getFirstName());
               
				break;
			case 4:
				System.out.println("Enter the input to view person 1.city 2.state ");
				int input=sc.nextInt();
				if(input==1) {
				System.out.println("Enter the city name");
				String cityName1=sc.next();
				AddressBook cityObj=addressbook.personCityState(cityName1);
				System.out.println("The person is:");
                System.out.println(cityObj.getFirstName());
                
				}else if(input==2) {
				
				System.out.println("Enter the state name");
				String stateName=sc.next();
				AddressBook stateObj=addressbook.personCityState(stateName);
				System.out.println(stateObj.getFirstName());
				break;
				}
			case 5:
				System.out.println("Enter the input to view person 1.city 2.state ");
				int input1=sc.nextInt();
				if(input1==1) {
				System.out.println("Enter the city name");
				String cityName1=sc.next();
				int countCity=addressbook.noOfContact(cityName1);
				System.out.println("The count is:");
                System.out.println("No of contact:" +countCity);
                
				}else if(input1==2) {
				
				System.out.println("Enter the state name");
				String stateName=sc.next();
				int countState=addressbook.noOfContact(stateName);
				System.out.println("The count is:");
                System.out.println("No of contact:" +countState);
				break;
				
				}default:
					
			}	
			}while(true);
		
		
			
	
		}
	
	}


