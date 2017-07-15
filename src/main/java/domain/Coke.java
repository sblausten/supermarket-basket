package domain;

public class Coke implements Item {

	public static String displayName = "coke";
	public static Double unitPrice = 0.7;

	public static String getDisplayName() {
		return Coke.displayName;
	}
	
	public static void setDisplayName(String newName) {
		Coke.displayName = newName;
	}
	
	public static Double getUnitPrice() {
		return Coke.unitPrice;
	}
	
	public static void setUnitPrice(Double newPrice) {
		Coke.unitPrice = newPrice;
	}
	
}
