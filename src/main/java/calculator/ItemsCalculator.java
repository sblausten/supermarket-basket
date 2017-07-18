package calculator;

import java.math.BigDecimal;
import java.util.List;

import items.Item;

public class ItemsCalculator {
	private BigDecimal itemsTotal = new BigDecimal("0.00");

	public ItemsCalculator(List<Item> items) {
		setTotal(items);
	}

	public BigDecimal getItemsTotal() {
		return itemsTotal.setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}

	private final void setTotal(List<Item> items) {
		for (Item item : items) {
			itemsTotal = itemsTotal.add(item.getUnitPrice());
		}
	}

}
