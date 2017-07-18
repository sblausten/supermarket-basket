package offers;

import java.math.BigDecimal;

public class CokeOffer implements Offer {

	private static BigDecimal saving = new BigDecimal("-0.4");
	private static String description = "Coke 2 for £1";
	private static int multiple = 2;
	
	private BigDecimal offerSavingTotal;
	private int offerCount;
	
	public CokeOffer(int itemQuantity) {
		setOfferCount(itemQuantity);
		setOfferSavingTotal(itemQuantity);
	}
	
	@Override
	public String getOfferDescription() {
		return CokeOffer.description;
	}
	
	@Override
	public BigDecimal getOfferSavingTotal() {
		return offerSavingTotal;
	}
	
	@Override
	public int getOfferCount() {
		return offerCount;
	}
	
	private final void setOfferSavingTotal(int itemQuantity) {
		if (itemQuantity >= CokeOffer.multiple) {
			BigDecimal offerCount = new BigDecimal(getOfferCount());
			System.out.println(offerCount);
			offerSavingTotal = CokeOffer.saving.multiply(offerCount).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		} else {
			offerSavingTotal = new BigDecimal("0.00");
		}
	}

	private final void setOfferCount(int itemQuantity) {
		if (itemQuantity >= CokeOffer.multiple) {
			int extra = itemQuantity % CokeOffer.multiple;
			offerCount = ((itemQuantity - extra) / CokeOffer.multiple);
		} else {
			offerCount = 0;
		}
	}
}
