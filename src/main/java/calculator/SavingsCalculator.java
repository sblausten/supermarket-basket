package calculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import items.Item;
import offers.Offer;

public class SavingsCalculator {
	
	private List<Offer> offersApplied = new ArrayList<Offer>();
	private List<Item> items = new ArrayList<Item>();

	public SavingsCalculator(List<Item> basketItems, List<Offer> liveOffers) {
		items = basketItems;
		setOffersApplied(liveOffers);
	}

	public List<Offer> getOffersApplied() {
		return offersApplied;
	}
	
	public BigDecimal getSavingsTotal() {
		BigDecimal total = new BigDecimal("0.00");
		for (Offer offer : offersApplied) {
	    total = total.add(offer.getOfferSavingTotal());
		}
		return total;
	}

	private final void setOffersApplied(List<Offer> liveOffers) {
		for (Offer offer : liveOffers) {
			addOffer(offer, offer.getItemName());
		}
	}
	
	private void addOffer(Offer offer, String displayName) {
		if (offer.getItemName().equals(displayName)) {
			offer.setOffer(countItems(displayName));
			offersApplied.add(offer);
		}
	}
	
	private int countItems(String itemName) {
		int count = 0;
		for (Item item : getItems()) {
			if (item.getDisplayName().equals(itemName)) {
				count ++;
			}
		}
		return count;
	}
	
	private List<Item> getItems() {
		return items;
	}
}
