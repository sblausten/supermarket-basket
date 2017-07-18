package items;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import items.Item;

public class ItemTest {

	@Test
	public void getDisplayName_ShouldReturnNameItemInitializedWith() {
		BigDecimal price = new BigDecimal("0.5").setScale(2, BigDecimal.ROUND_HALF_EVEN);
		Item testItem = new Item("test", price);
		assertEquals("test", testItem.getDisplayName());
	}
	
	@Test
	public void getUnitPrice_ShouldReturnPriceItemInitializedWith() {
		BigDecimal price = new BigDecimal("0.5").setScale(2, BigDecimal.ROUND_HALF_EVEN);
		Item testItem = new Item("test", price);
		assertEquals(price, testItem.getUnitPrice());
	}

}
