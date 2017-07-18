package items;

import java.math.BigDecimal;

public interface Items {
	
	public Item getNewItem(String itemName);
	public BigDecimal getItemPrice(String itemName);
	public void addNewItemType(String itemName, BigDecimal unitPrice);
	public void updateItemPrice(String itemName, BigDecimal unitPrice);

}