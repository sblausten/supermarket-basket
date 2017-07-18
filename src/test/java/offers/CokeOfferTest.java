package offers;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class CokeOfferTest {

	@Test
	public void getOfferDescription_ShouldReturnString() {
		CokeOffer testOffer = new CokeOffer();
		testOffer.setOffer(2);
		assertEquals(testOffer.getOfferDescription(), "Coke 2 for £1");
	}
	
	@Test
	public void getOfferSavingTotal_ShouldReturnCorrectSavingsTotal() {
		CokeOffer testOffer = new CokeOffer();
		testOffer.setOffer(3);
		BigDecimal expectedSaving = new BigDecimal("-0.40");
		assertTrue(expectedSaving.compareTo(testOffer.getOfferSavingTotal()) == 0);
	}
	
	@Test
	public void getOfferSavingTotal_ShouldReturnCorrectSavingsTotalWhenOffersAppliedIsZero() {
		CokeOffer testOffer = new CokeOffer();
		testOffer.setOffer(1);
		BigDecimal expectedSaving = new BigDecimal("0.00");
		assertTrue(expectedSaving.compareTo(testOffer.getOfferSavingTotal()) == 0);
	}
	
	@Test
	public void getOfferCount_ShouldReturnNumOfOffersWhenItemsNumGreaterThanMultiple() {
		CokeOffer testOffer = new CokeOffer();
		testOffer.setOffer(4);
		assertEquals(testOffer.getOfferCount(), 2);
		CokeOffer testOffer2 = new CokeOffer();
		testOffer2.setOffer(6);
		assertEquals(testOffer2.getOfferCount(), 3);
	}
	
	@Test
	public void getOfferCount_ShouldZeroOffersWhenItemsNumLessThanMultiple() {
		CokeOffer testOffer = new CokeOffer();
		testOffer.setOffer(1);
		assertEquals(testOffer.getOfferCount(), 0);
		CokeOffer testOffer2 = new CokeOffer();
		testOffer.setOffer(0);
		assertEquals(testOffer2.getOfferCount(), 0);
	}
}
