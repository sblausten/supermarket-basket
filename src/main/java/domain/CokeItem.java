package domain;

public class CokeItem implements Item {

	public static String displayName = "coke";
	public static Double unitPrice = 0.7;

	public static String getDisplayName() {
		return CokeItem.displayName;
	}
	
	public static void setDisplayName(String newName) {
		CokeItem.displayName = newName;
	}
	
	public static Double getUnitPrice() {
		return CokeItem.unitPrice;
	}
	
	public static void setUnitPrice(Double newPrice) {
		CokeItem.unitPrice = newPrice;
	}
	
}
