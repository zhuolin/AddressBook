package addressbook.controller;

import java.util.TreeMap;

import addressbook.entity.AddressBook;
import addressbook.entity.AddressBookItem;

public class AddressBookController {
	private TreeMap<String, AddressBook> addressBookList;
	private String username;
	
	public AddressBookController(){
		this.addressBookList = new TreeMap<String,AddressBook>();
		this.username="ReeceAdmin";
	}
	
	public AddressBookController(TreeMap<String,AddressBook> addressBookList){
		this.addressBookList = addressBookList;
		this.username="ReeceAdmin";
	}
	
	public boolean addContact(String addressBookName, AddressBookItem contact){
		
		return false;
	}
	
	public boolean removeContact(String addressBookName, AddressBookItem contact){
		
		return false;
	}
	
	public void printAddressBook(String addressBookName){
		
	}
	
	public boolean createAddressBook(String addressBookName){
		
		return false;
	}
	
	public boolean addAddressBookName(String addressBookName){
		
		return false;
	}
	
	public void printGroupedContacts(){
		
		
	}

	public TreeMap<String, AddressBook> getAddressBookList() {
		return addressBookList;
	}

	public void setAddressBookList(TreeMap<String, AddressBook> addressBookList) {
		this.addressBookList = addressBookList;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
