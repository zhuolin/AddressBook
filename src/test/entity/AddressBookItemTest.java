package test.entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import addressbook.entity.AddressBookItem;

public class AddressBookItemTest {
	private AddressBookItem item,item2,item3;
	
	@Before
	public void init(){
		this.item = new AddressBookItem();
		this.item2 = new AddressBookItem();
		this.item3 = new AddressBookItem("Jack","11111111");
		
		item2.setName("test");
		item2.setPhone("12345678");
	}

	@Test
	public void test() {
		assertNull(item.getName());
		assertNull(item.getPhone());
		
		assertEquals("test", item2.getName());
		assertEquals("12345678", item2.getPhone());
		
		assertEquals("Jack", item3.getName());
		assertEquals("11111111", item3.getPhone());
	}

}
