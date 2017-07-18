package offers;

import java.math.BigDecimal;

public interface Offer {

	String getOfferDescription();
	BigDecimal getOfferSavingTotal();
	int getOfferCount();
	
}
