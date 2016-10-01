package test.entity;

import static org.junit.Assert.*;
import java.util.TreeMap;
import org.junit.Before;
import org.junit.Test;

import addressbook.entity.AddressBook;
import addressbook.entity.AddressBookItem;

public class AddressBookTest {
	private AddressBook addressBook;
	private AddressBookItem item1, item2, item3, item4;
	
	@Before
	public void init(){
		this.addressBook = new AddressBook();
		TreeMap<String, AddressBookItem> items = new TreeMap<String, AddressBookItem>();
		this.item1 = new AddressBookItem("Person1","1111");
		this.item2 = new AddressBookItem("Person2","2222");
		this.item3 = new AddressBookItem("Person3","3333");
		this.item4 = new AddressBookItem("Person4","4444");
		items.put(item1.getName(), item1);
		items.put(item2.getName(), item2);
		items.put(item3.getName(), item3);
		items.put(item4.getName(), item4);
		this.addressBook.setItems(items);
		this.addressBook.setBookName("Retail");
	}
	

	@Test
	public void test() {
		assertEquals(this.addressBook.getItems().size(), 4);
		assertEquals("3333",this.addressBook.getItems().get("Person3").getPhone());
		
	}

}
