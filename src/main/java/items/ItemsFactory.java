package items;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ItemsFactory implements Items {

	private static Map<String, BigDecimal> items = new HashMap<String, BigDecimal>();

	public ItemsFactory() {
		items.put("coke", new BigDecimal("0.70"));
		items.put("beans", new BigDecimal("0.50"));
		items.put("oranges", new BigDecimal("0.00199"));
	}

	public Item getNewItem(String itemName) {
		try {
			BigDecimal itemPrice = getItemPrice(itemName);
			if (itemPrice != null) {
				return new Item(itemName, itemPrice);
			}
			throw new Exception("Requested item has price: " + itemPrice);
		} catch (Exception e) {
			System.err.println(e.toString());
			return null;
		}
	}

	public BigDecimal getItemPrice(String itemName) {
		try {
			itemName = itemName.toLowerCase();
			if (items.containsKey(itemName)) {
				return items.get(itemName);
			}
			throw new Exception("Requested Item does not exist with that name");
		} catch (Exception e) {
			System.err.println(e.toString());
			return null;
		}
	}

	public void addNewItemType(String name, BigDecimal price) {
		try {
			if (items.containsKey(name)) {
				throw new IllegalArgumentException("Item already exists. Please update it instead.");
			} else {
				items.put(name.toLowerCase(), price);
			}
		} catch (IllegalArgumentException e) {
			System.err.println(e.toString());
		}
	}

	public void updateItemPrice(String name, BigDecimal price) {
		name = name.toLowerCase();
		if (items.containsKey(name)) {
			items.replace(name, price);
		} else {
			items.put(name, price);
			System.out.println("Item did not exist so new a item was added.");
		}
	}
}
