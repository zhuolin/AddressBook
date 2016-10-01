package addressbook.entity;

import java.util.TreeMap;

public class UserAccount {
	private TreeMap<String, AddressBook> addressBookList;
	private String username;
	
	public UserAccount(){
		this.addressBookList = new TreeMap<String,AddressBook>();
		this.username="ReeceAdmin";
	}
	
	public UserAccount(TreeMap<String,AddressBook> addressBookList){
		this.addressBookList = addressBookList;
		this.username="ReeceAdmin";
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
