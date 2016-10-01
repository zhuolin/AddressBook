package test.entity.controller;

import static org.junit.Assert.*;

import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

import addressbook.entity.AddressBookItem;

public class AddressBookController {
	private addressbook.controller.AddressBookController controller;
	private TreeMap<String, AddressBookItem> contactList;
	
	@Before
	public void init(){
		this.controller = new addressbook.controller.AddressBookController();
		this.contactList = new TreeMap<String,AddressBookItem>();
		contactList.put("andy", new AddressBookItem("andy","1111"));
		contactList.put("beck", new AddressBookItem("beck","2222"));
		contactList.put("charlie", new AddressBookItem("charlie","3333"));
	}

	@Test
	public void test() {
		assertTrue(controller.addContact("retail", new AddressBookItem("david","4444")));
		assertTrue(controller.addAddressBook("wholesale"));
		assertTrue(controller.removeContact("retail",new AddressBookItem("david","4444")));
		assertTrue(controller.removeAddressBook("wholesale"));
		fail("Not yet implemented");
	}

}
