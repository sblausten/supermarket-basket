package items;

import java.math.BigDecimal;

public class Item {
	
	private String displayName;
	private BigDecimal unitPrice;
	
	public Item(String name, BigDecimal price) {
		displayName = name;
		unitPrice = price;
	}
	
	public String getDisplayName() {
		return this.displayName;
	}
	
	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}
	
}
