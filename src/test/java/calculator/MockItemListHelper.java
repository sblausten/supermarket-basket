package calculator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import items.Item;

public class MockItemListHelper {

	public Item mockItem50p() {
		Item mockItem = mock(Item.class);
		when(mockItem.getUnitPrice()).thenReturn(new BigDecimal("0.50"));
		return mockItem;
	}
	
	public Item mockItem014p() {
		Item mockItem = mock(Item.class);
		when(mockItem.getUnitPrice()).thenReturn(new BigDecimal("0.014"));
		return mockItem;
	}
	
	public Item mockItemCoke() {
		Item mockItem = mock(Item.class);
		when(mockItem.getUnitPrice()).thenReturn(new BigDecimal("0.70"));
		when(mockItem.getDisplayName()).thenReturn("coke");
		return mockItem;
	}
	
	public Item mockItemBeans() {
		Item mockItem = mock(Item.class);
		when(mockItem.getUnitPrice()).thenReturn(new BigDecimal("0.50"));
		when(mockItem.getDisplayName()).thenReturn("beans");
		return mockItem;
	}
	
	public List<Item> mockItemList(Item mockItem, int count) {
		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < count; i++) {
			items.add(mockItem);
		}
		return items;
	}

}
