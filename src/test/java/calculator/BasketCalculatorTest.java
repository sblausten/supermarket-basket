package calculator;

import static org.mockito.Mockito.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import offers.Offer;

public class BasketCalculatorTest {
	
	private Offer mockOffer() {
		Offer mockOffer = mock(Offer.class);
		return mockOffer;
	}
	
	private List<Offer> mockOfferList() {
		List<Offer> offers = new ArrayList<Offer>(Arrays.asList(mockOffer(), mockOffer()));
		return offers;
	}
	
	private SavingsCalculator mockSavingsCalculator() {
		List<Offer> offers = mockOfferList();
		SavingsCalculator mockCalc = mock(SavingsCalculator.class);
		when(mockCalc.getSavingsTotal()).thenReturn(new BigDecimal(5.50));
		when(mockCalc.getOffersApplied()).thenReturn(offers);
		return mockCalc;
	}
	
	private ItemsCalculator mockItemsCalculator() {
		ItemsCalculator mockCalc = mock(ItemsCalculator.class);
		when(mockCalc.getItemsTotal()).thenReturn(new BigDecimal(10.50));
		return mockCalc;
	}

	@Test
	public void getItemsTotal_ShouldCallGetItemsTotalOnBasketCalculator() {
		ItemsCalculator mockItems = mockItemsCalculator();
		SavingsCalculator mockSavings = mockSavingsCalculator();
		BasketCalculator testCalc = new BasketCalculator(mockItems, mockSavings);
		testCalc.getItemsTotal();
		verify(mockItems, times(1)).getItemsTotal();
	}
	
	@Test
	public void getSavingsTotal_ShouldCallGetSavingsTotalOnBasketCalculator() {
		ItemsCalculator mockItems = mockItemsCalculator();
		SavingsCalculator mockSavings = mockSavingsCalculator();
		BasketCalculator testCalc = new BasketCalculator(mockItems, mockSavings);
		testCalc.getSavingsTotal();
		verify(mockSavings, times(1)).getSavingsTotal();
	}
	
	@Test
	public void getOffersApplied_ShouldCallGetOffersAppliedOnBasketCalculator() {
		ItemsCalculator mockItems = mockItemsCalculator();
		SavingsCalculator mockSavings = mockSavingsCalculator();
		BasketCalculator testCalc = new BasketCalculator(mockItems, mockSavings);
		testCalc.getOffersApplied();
		verify(mockSavings, times(1)).getOffersApplied();
	}

}
