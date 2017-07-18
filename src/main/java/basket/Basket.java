package basket;

import java.util.ArrayList;
import java.util.List;

import items.Item;
import till.TillGenerator;

public class Basket {

	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item type) {
		items.add(type);
	}

	public void checkout() {
		TillGenerator.newTill(items);
	}

}
