package domain;

public class Beans implements Item {
	
	public static String displayName = "beans";
	public static Double unitPrice = 0.5;
	
	public static String getDisplayName() {
		return Beans.displayName;
	}
	
	public static void setDisplayName(String newName) {
		Beans.displayName = newName;
	}
	
	public static Double getUnitPrice() {
		return Beans.unitPrice;
	}
	
	public static void setUnitPrice(Double newPrice) {
		Beans.unitPrice = newPrice;
	}

}
