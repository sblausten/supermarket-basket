package till;

import java.math.BigDecimal;
import java.util.List;

import calculator.ItemsCalculator;
import calculator.SavingsCalculator;
import offers.Offer;

public class BasketTill implements Till{

	private SavingsCalculator savingsCalculator;
	private ItemsCalculator itemsCalculator;
	
	public BasketTill(ItemsCalculator itemsCalc, SavingsCalculator savingsCalc) {
		savingsCalculator = savingsCalc;
		itemsCalculator = itemsCalc;
	}

	public BigDecimal getNetTotal() {
		return getItemsTotal().add(getSavingsTotal());
	}

	public BigDecimal getItemsTotal() {
		return itemsCalculator.getItemsTotal();
	}

	public BigDecimal getSavingsTotal() {
		return savingsCalculator.getSavingsTotal();
	}

	public List<Offer> getOffersApplied() {
		return savingsCalculator.getOffersApplied();
	}
	
}
