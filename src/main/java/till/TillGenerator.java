package till;

import java.util.ArrayList;
import java.util.List;

import calculator.ItemsCalculator;
import calculator.SavingsCalculator;
import items.Item;
import offers.BeansOffer;
import offers.CokeOffer;
import offers.Offer;

public class TillGenerator {
	
	private TillGenerator() {
	}
	
	public static final void newTill(List<Item> items) {
		List<Offer> liveOffers = new ArrayList<Offer>();
		liveOffers.add(new CokeOffer());
		liveOffers.add(new BeansOffer());
		new BasketTill(
				new ItemsCalculator(items), 
				new SavingsCalculator(items, liveOffers)
		);
	}

}
