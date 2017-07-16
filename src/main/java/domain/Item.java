package domain;

public class Item {
	
	private String displayName;
	private Double unitPrice;
	
	public Item(String name, Double price) {
		displayName = name;
		unitPrice = price;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	public Double getUnitPrice() {
		return this.unitPrice;
	}
	
}
