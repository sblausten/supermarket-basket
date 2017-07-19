package basket;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import items.Item;

public class BasketTest {

	@Test
	public void addItem_ShouldAddOneItemToItems() {
		Item mockItem = mock(Item.class);
		Basket testBasket = new Basket();
		testBasket.addItem(mockItem);
		assertEquals(1, testBasket.getItems().size());
	}
	
	@Test
	public void addItem_ShouldAddCorrectItemToItems() {
		Item mockItem = mock(Item.class);
		Basket testBasket = new Basket();
		testBasket.addItem(mockItem);
		assertEquals(mockItem, testBasket.getItems().get(0));
	}
	
	@Test
	public void addItemByWeight_ShouldAddMultipleInstancesOfItemToItems() {
		Item mockItem = mock(Item.class);
		Basket testBasket = new Basket();
		testBasket.addItemByWeight(mockItem, 200);
		assertEquals(200, testBasket.getItems().size());
	}
	
	@Test
	public void addItemByWeight_ShouldNotAddItemToItemsWhenWeightIsZero() {
		Item mockItem = mock(Item.class);
		Basket testBasket = new Basket();
		testBasket.addItemByWeight(mockItem, 0);
		assertEquals(0, testBasket.getItems().size());
	}

}
