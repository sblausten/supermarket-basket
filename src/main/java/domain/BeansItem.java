package domain;

public class BeansItem implements Item {
	
	public static String displayName = "beans";
	public static Double unitPrice = 0.5;
	
	public static String getDisplayName() {
		return BeansItem.displayName;
	}
	
	public static void setDisplayName(String newName) {
		BeansItem.displayName = newName;
	}
	
	public static Double getUnitPrice() {
		return BeansItem.unitPrice;
	}
	
	public static void setUnitPrice(Double newPrice) {
		BeansItem.unitPrice = newPrice;
	}

}
