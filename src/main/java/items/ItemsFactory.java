package items;

import java.util.HashMap;
import java.util.Map;

public class ItemsFactory implements Items {

	private static Map<String, Double> items = new HashMap<String, Double>();

	public ItemsFactory() {
		items.put("coke", 0.7);
		items.put("beans", 0.5);
		items.put("oranges", 0.00199);
	}

	public Item getNewItem(String itemName) {
		try {
			Double itemPrice = getItemPrice(itemName);
			if (itemPrice != null) {
				return new Item(itemName, itemPrice);
			}
			throw new Exception("Requested item has price: " + itemPrice);
		} catch (Exception e) {
			System.err.println(e.toString());
			return null;
		}
	}

	public Double getItemPrice(String itemName) {
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

	public void addNewItemType(String name, Double price) {
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

	public void updateItemPrice(String name, Double price) {
		name = name.toLowerCase();
		if (items.containsKey(name)) {
			items.replace(name, price);
		} else {
			items.put(name, price);
			System.out.println("Item did not exist so new a item was added.");
		}
	}
}
