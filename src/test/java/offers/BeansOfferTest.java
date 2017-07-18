package offers;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class BeansOfferTest {

	@Test
	public void getOfferDescription_ShouldReturnString() {
		BeansOffer testOffer = new BeansOffer(3);
		assertEquals(testOffer.getOfferDescription(), "Beans 3 for 2");
	}
	
	@Test
	public void getOfferSavingTotal_ShouldReturnCorrectSavingsTotal() {
		BeansOffer testOffer = new BeansOffer(3);
		BigDecimal expectedSaving = new BigDecimal("-0.50");
		assertTrue(expectedSaving.compareTo(testOffer.getOfferSavingTotal()) == 0);
	}
	
	@Test
	public void getOfferSavingTotal_ShouldReturnCorrectSavingsTotalWhenOffersAppliedIsZero() {
		BeansOffer testOffer = new BeansOffer(2);
		BigDecimal expectedSaving = new BigDecimal("0.00");
		assertTrue(expectedSaving.compareTo(testOffer.getOfferSavingTotal()) == 0);
	}
	
	@Test
	public void getOfferCount_ShouldReturnNumOfOffersWhenItemsNumGreaterThanMultiple() {
		BeansOffer testOffer = new BeansOffer(4);
		assertEquals(testOffer.getOfferCount(), 1);
		BeansOffer testOffer2 = new BeansOffer(6);
		assertEquals(testOffer2.getOfferCount(), 2);
	}
	
	@Test
	public void getOfferCount_ShouldZeroOffersWhenItemsNumLessThanMultiple() {
		BeansOffer testOffer = new BeansOffer(0);
		assertEquals(testOffer.getOfferCount(), 0);
		BeansOffer testOffer2 = new BeansOffer(2);
		assertEquals(testOffer2.getOfferCount(), 0);
	}
}
