package till;

import calculator.ItemsCalculator;
import calculator.SavingsCalculator;
import items.Item;
import offers.Offer;

import java.math.BigDecimal;
import java.util.List;

import calculator.BasketCalculator;

public class Till {

	private BasketCalculator basketCalculator;

	public Till(List<Item> items) {
		basketCalculator = new BasketCalculator(new ItemsCalculator(items), new SavingsCalculator(items));
	}

	public BigDecimal getNetTotal() {
		return basketCalculator.getNetTotal();
	}

	public BigDecimal getItemsTotal() {
		return basketCalculator.getItemsTotal();
	}

	public BigDecimal getSavingsTotal() {
		return basketCalculator.getSavingsTotal();
	}

	public List<Offer> getOffersApplied() {
		return basketCalculator.getOffersApplied();
	}

}
