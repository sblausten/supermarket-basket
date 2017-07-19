package calculator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import offers.Offer;

public class MockOfferListHelper {
	
	public Offer mockBeans(int count) {
		Offer mockOffer = mock(Offer.class);
		when(mockOffer.getItemName()).thenReturn("beans");
		when(mockOffer.getOfferDescription()).thenReturn("Beans 3 for 2");
		when(mockOffer.getOfferSavingTotal()).thenReturn(new BigDecimal("-0.50"));
		when(mockOffer.getOfferCount()).thenReturn(count);
		return mockOffer;
	}
	
	public Offer mockCoke(int count) {
		Offer mockOffer = mock(Offer.class);
		when(mockOffer.getItemName()).thenReturn("beans");
		when(mockOffer.getOfferDescription()).thenReturn("Coke 2 for £1");
		when(mockOffer.getOfferSavingTotal()).thenReturn(new BigDecimal("-0.40"));
		when(mockOffer.getOfferCount()).thenReturn(count);
		return mockOffer;
	}
	
	public List<Offer> mockList(Offer mockOffer1, Offer mockOffer2) {
		List<Offer> offers = new ArrayList<Offer>();
		offers.add(mockOffer1);
		offers.add(mockOffer2);	
		return offers;
	}

}
