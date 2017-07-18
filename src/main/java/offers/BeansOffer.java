package offers;

import java.math.BigDecimal;

public class BeansOffer implements Offer{

	private static BigDecimal saving = new BigDecimal("-0.50").setScale(2, BigDecimal.ROUND_HALF_EVEN);
	private static String description = "Beans 3 for 2";
	private static String itemName = "beans";
	private static int multiple = 3;
	
	private BigDecimal offerSavingTotal;
	private int offerCount;
	
	@Override
	public void setOffer(int itemQuantity) {
		setOfferCount(itemQuantity);
		setOfferSavingTotal(itemQuantity);
	}
	
	@Override
	public String getOfferDescription() {
		return BeansOffer.description;
	}
	
	@Override
	public BigDecimal getOfferSavingTotal() {
		return offerSavingTotal;
	}
	
	@Override
	public int getOfferCount() {
		return offerCount;
	}
	
	@Override
	public String getItemName() {
		return itemName;
	}
	
	private final void setOfferSavingTotal(int itemQuantity) {
		if (itemQuantity >= BeansOffer.multiple) {
			BigDecimal offerCount = new BigDecimal(getOfferCount());
			System.out.println(offerCount);
			offerSavingTotal = BeansOffer.saving.multiply(offerCount).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		} else {
			offerSavingTotal = new BigDecimal("0.00");
		}
	}

	private final void setOfferCount(int itemQuantity) {
		if (itemQuantity >= BeansOffer.multiple) {
			int extra = itemQuantity % BeansOffer.multiple;
			offerCount = ((itemQuantity - extra) / BeansOffer.multiple);
		} else {
			offerCount = 0;
		}
	}
}
