package basket;

import java.util.ArrayList;
import java.util.List;

import domain.Item;

public class ItemBasket implements Basket {
	
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item type) {
		items.add(type);
	}
	
	public void checkout() {
		
	}

}
