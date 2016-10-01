package test.controller;

import static org.junit.Assert.*;

import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

import addressbook.entity.AddressBookItem;

public class AddressBookControllerTest {
	private addressbook.controller.AddressBookController controller;
	
	@Before
	public void init(){
		this.controller = new addressbook.controller.AddressBookController();
	}

	@Test
	public void test() {
		assertTrue(controller.createAddressBook("retail"));
		assertTrue(controller.createAddressBook("wholesale"));
		
		assertTrue(controller.addContact("retail", new AddressBookItem("Person1","1111")));
		assertTrue(controller.addContact("retail", new AddressBookItem("Person2","2222")));
		assertTrue(controller.addContact("retail", new AddressBookItem("Person3","3333")));
		
		assertTrue(controller.addContact("wholesale", new AddressBookItem("Person3","3334")));
		assertTrue(controller.addContact("wholesale", new AddressBookItem("Person5","5555")));
		assertTrue(controller.addContact("wholesale", new AddressBookItem("Person6","6666")));
		
		controller.printAddressBook("retail");
		controller.printGroupedContacts();
		
		assertTrue(controller.addContact("wholesale", new AddressBookItem("Person7","7777")));
		assertTrue(controller.removeContact("wholesale", new AddressBookItem("Person6","")));
		
		controller.printAddressBook("wholesale");
		controller.printGroupedContacts();
		
		assertFalse(controller.addContact("supplier", new AddressBookItem("Person3","3335")));
		assertTrue(controller.createAddressBook("supplier"));
		assertTrue(controller.addContact("supplier", new AddressBookItem("Person3","3335")));
		
		controller.printGroupedContacts();
		
	}

}
