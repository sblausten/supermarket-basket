package domain;

public class OrangesItem implements Item {

	public static String displayName = "oranges";
	public static Double unitPrice = 0.00199;

	public static String getDisplayName() {
		return OrangesItem.displayName;
	}
	
	public static void setDisplayName(String newName) {
		OrangesItem.displayName = newName;
	}
	
	public static Double getUnitPrice() {
		return OrangesItem.unitPrice;
	}
	
	public static void setUnitPrice(Double newPrice) {
		OrangesItem.unitPrice = newPrice;
	}
	
}
