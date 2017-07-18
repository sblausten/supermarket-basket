package calculator;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import items.Item;

public class ItemsCalculatorTest {
	
	private Item mockItem1() {
		Item mockItem = mock(Item.class);
		when(mockItem.getUnitPrice()).thenReturn(new BigDecimal("0.50"));
		return mockItem;
	}
	
	private Item mockItem2() {
		Item mockItem = mock(Item.class);
		when(mockItem.getUnitPrice()).thenReturn(new BigDecimal("0.014"));
		return mockItem;
	}
	
	private List<Item> mockItemList(Item mockItem) {
		List<Item> items = new ArrayList<Item>(Arrays.asList(mockItem, mockItem));
		return items;
	}

	@Test
	public void getItemsTotal_ShouldReturnCorrectTotalPrice() {
		List<Item> items = mockItemList(mockItem1());	
		ItemsCalculator testCalc = new ItemsCalculator(items);
		BigDecimal expectedTotal = new BigDecimal("1.00");
		assertTrue(expectedTotal.compareTo(testCalc.getItemsTotal()) == 0);
	}
	
	@Test
	public void getItemsTotal_ShouldRoundCorrectTotalPriceTwoDecimalPlaces() {
		List<Item> items = mockItemList(mockItem2());	
		ItemsCalculator testCalc = new ItemsCalculator(items);
		BigDecimal expectedTotal = new BigDecimal("0.03");
		System.out.println(testCalc.getItemsTotal());
		assertTrue(expectedTotal.compareTo(testCalc.getItemsTotal()) == 0);
	}

}
