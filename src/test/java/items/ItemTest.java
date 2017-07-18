package items;

import static org.junit.Assert.*;

import org.junit.Test;

import items.Item;

public class ItemTest {

	@Test
	public void getDisplayName_ShouldReturnNameItemInitializedWith() {
		Item testItem = new Item("test", 0.5);
		assertEquals("test", testItem.getDisplayName());
	}
	
	@Test
	public void getUnitPrice_ShouldReturnPriceItemInitializedWith() {
		Item testItem = new Item("test", 0.5);
		assertEquals((Double)0.5, testItem.getUnitPrice());
	}

}
