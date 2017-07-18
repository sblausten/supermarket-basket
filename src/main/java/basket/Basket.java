package basket;

import java.util.ArrayList;
import java.util.List;

import items.Item;
import till.Till;

public class Basket {

	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item type) {
		items.add(type);
	}

	public Till checkout() {
		return new Till(items);
	}

}
