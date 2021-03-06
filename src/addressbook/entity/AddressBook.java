package addressbook.entity;

import java.util.TreeMap;

public class AddressBook {
	TreeMap<String, AddressBookItem> items;
	String bookName;
	
	public AddressBook(String name){
		this.bookName = name;
		items = new TreeMap<String, AddressBookItem>();
	}
	
	public AddressBook(){
		this.bookName = "untitled";
		items = new TreeMap<String, AddressBookItem>();
	}
	
	public TreeMap<String, AddressBookItem> getItems() {
		return items;
	}
	public void setItems(TreeMap<String, AddressBookItem> items) {
		this.items = items;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}
