package domain;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.Test;

public class ItemFactoryTest {

	@Test
	public void getItem_ShouldReturnNullIfNotPassedValidItemName() {
		ItemFactory testFactory = new ItemFactory();
		assertEquals(null, testFactory.getItem("test"));
	}
	
	@Test
	public void getItem_ShouldReturnNullIfPassedNull() {
		ItemFactory testFactory = new ItemFactory();
		assertEquals(null, testFactory.getItem(null));
	}
	
	@Test
	public void getItem_ShouldReturnItemIfPassedValidItemName() {
		ItemFactory testFactory = new ItemFactory();
		assertThat(testFactory.getItem("beans"), instanceOf(Item.class));
	}
	
	@Test
	public void getItem_ShouldReturnCorrectItemImplementationIfPassedValidItemName() {
		ItemFactory testFactory = new ItemFactory();
		assertThat(testFactory.getItem("beans"), instanceOf(Beans.class));
	}
}
