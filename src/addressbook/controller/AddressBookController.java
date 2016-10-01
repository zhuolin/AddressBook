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
	
	/**
	 * adding contact entry to an addressbook
	 * @param addressBookName
	 * @param contact
	 * @return true if insert successfully
	 */
	public boolean addContact(String addressBookName, AddressBookItem contact){
		if(addressBookName == null || contact == null || "".equalsIgnoreCase(contact.getName())){
			System.out.println("Address book could not found or contact is empty");
			return false;
		}
		try{
			if(addressBookList.get(addressBookName).getItems().containsKey(contact.getName())){
				String cmbPhone = addressBookList.get(addressBookName).getItems().get(contact.getName()).getPhone() + ";" + contact.getPhone();
				contact.setPhone(cmbPhone);
				addressBookList.get(addressBookName).getItems().put(contact.getName(), contact);
			}else{
				addressBookList.get(addressBookName).getItems().put(contact.getName(), contact);
			}
		}catch(Exception e){
			System.out.println("Could not find address book.");
			return false;
		}
		return true;
	}
	
	/**
	 * remove contact entry from an addressbook
	 * @param addressBookName
	 * @param contact
	 * @return true if remove successfully otherwise, false
	 */
	public boolean removeContact(String addressBookName, AddressBookItem contact){
		if(addressBookName == null || contact == null || "".equalsIgnoreCase(contact.getName())){
			System.out.println("Address book could not found or contact is empty");
			return false;
		}
		try{
			addressBookList.get(addressBookName).getItems().remove(contact.getName());
		}catch(Exception e){
			System.out.println("Error with removing contact from address book:"+addressBookName);
			return false;
		}
		return true;
	}
	
	/**
	 * print all contacts in an address book
	 * @param addressBookName
	 */
	public void printAddressBook(String addressBookName){
		if(addressBookName == null || "".equalsIgnoreCase(addressBookName)){
			System.out.println("--Could not find address book with emtpy name--");
			return;
		}
		AddressBook book = addressBookList.get(addressBookName);
		if(book == null || book.getItems() == null || book.getItems().size() == 0){
			System.out.println("--address book (" + addressBookName + ") has no contacts--");
			return;
		}
		//print address book
		System.out.println("-- Address Book: " + addressBookName);
		for(AddressBookItem item : book.getItems().values()){
			System.out.println(" -" + item.getName() + ":" + item.getPhone());
		}
	}
	
	/**
	 * create an address book to the list
	 * @param addressBookName
	 * @return true if creation is successful
	 */
	public boolean createAddressBook(String addressBookName){
		if(addressBookName == null || "".equalsIgnoreCase(addressBookName)){
			System.out.println("Could not create address book with emtpy name");
			return false;
		}
		if(addressBookList.containsKey(addressBookName)){
			System.out.println("address book already exists.");
			return false;
		}
		addressBookList.put(addressBookName, new AddressBook(addressBookName));
		return true;
	}
	
	/**
	 * remove an address book
	 * @param addressBookName
	 * @return true if remove successfully
	 */
	public boolean removeAddressBook(String addressBookName){
		if(addressBookName == null || "".equalsIgnoreCase(addressBookName)){
			System.out.println("Could not delete address book with emtpy name");
			return false;
		}
		if(addressBookList.containsKey(addressBookName)){
			addressBookList.remove(addressBookName);
			return true;
		}
		System.out.println("address book does not exist.");
		return false;
	}
	
	/**
	 * print all contact in all address books, phone numbers with same contact name will be concatenated 
	 */
	public void printGroupedContacts(){
		TreeMap<String, String> uniqueContacts = new TreeMap<String, String>();
		for(AddressBook book : addressBookList.values()){
			for(AddressBookItem item : book.getItems().values()){
				if(uniqueContacts.containsKey(item.getName())){
					String cmbPhone = uniqueContacts.get(item.getName()) + ";" + item.getPhone();
					uniqueContacts.put(item.getName(),cmbPhone);
				}else{
					uniqueContacts.put(item.getName(), item.getPhone());
				}
			}
		}
		if(uniqueContacts.size()>0){
			System.out.println("-- All contacts --");
			for(String name : uniqueContacts.keySet()){
				System.out.println(" -"+name+":"+uniqueContacts.get(name));
			}
		}else{
			System.out.println("-- No contact exists in all address books --");
		}
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
