package domain;

public class Oranges implements Item {

	public static String displayName = "oranges";
	public static Double unitPrice = 0.00199;

	public static String getDisplayName() {
		return Oranges.displayName;
	}
	
	public static void setDisplayName(String newName) {
		Oranges.displayName = newName;
	}
	
	public static Double getUnitPrice() {
		return Oranges.unitPrice;
	}
	
	public static void setUnitPrice(Double newPrice) {
		Oranges.unitPrice = newPrice;
	}
	
}
