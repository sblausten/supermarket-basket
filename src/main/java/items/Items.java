package items;

public interface Items {
	
	public Item getNewItem(String itemName);
	public Double getItemPrice(String itemName);
	public void addNewItemType(String itemName, Double unitPrice);
	public void updateItemPrice(String itemName, Double unitPrice);

}