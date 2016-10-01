package addressbook.main;

import addressbook.controller.AddressBookController;
import addressbook.entity.AddressBookItem;

public class Main {
	public static void main(String args[]){
		AddressBookController controller = new AddressBookController();
		
		controller.createAddressBook("retail");
		controller.createAddressBook("wholesale");
		
		controller.addContact("retail", new AddressBookItem("Person1","1111"));
		controller.addContact("retail", new AddressBookItem("Person2","2222"));
		controller.addContact("retail", new AddressBookItem("Person3","3333"));
		controller.addContact("wholesale", new AddressBookItem("Person3","3334"));
		controller.addContact("wholesale", new AddressBookItem("Person5","5555"));
		controller.addContact("wholesale", new AddressBookItem("Person6","6666"));
		
		controller.printAddressBook("retail");
		controller.printGroupedContacts();
		
		controller.addContact("wholesale", new AddressBookItem("Person7","7777"));
		controller.removeContact("wholesale", new AddressBookItem("Person6",""));
		
		controller.printAddressBook("wholesale");
		controller.printGroupedContacts();
		
		controller.addContact("supplier", new AddressBookItem("Person3","3335"));
		controller.createAddressBook("supplier");
		controller.addContact("supplier", new AddressBookItem("Person3","3335"));
		
		controller.printGroupedContacts();
	}
}
