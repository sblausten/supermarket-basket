package basket;

import domain.Item;

public interface Basket {
	
	public void addItem(Item type);
	public void checkout();
	
}
