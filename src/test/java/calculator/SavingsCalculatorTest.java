package calculator;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import items.Item;
import offers.Offer;

public class SavingsCalculatorTest {
	
	private SavingsCalculator setupTestSavingsCalculator(int beanOffers, int cokeOffers) {
		MockOfferListHelper offerHelper = new MockOfferListHelper();
		List<Offer> mockOffers = offerHelper.mockList(
				offerHelper.mockBeans(beanOffers), offerHelper.mockCoke(cokeOffers)
		);
		MockItemListHelper itemHelper = new MockItemListHelper();
		List<Item> mockItems = itemHelper.mockItemList(itemHelper.mockItemCoke(), 1);	
		SavingsCalculator testCalc = new SavingsCalculator(mockItems, mockOffers);
		return testCalc;
	}
	
	@Test
	public void getOffersApplied_ShouldReturnCorrectListOfOffersForBasketItems() {	
		SavingsCalculator testCalc = setupTestSavingsCalculator(3, 1);
		List<Offer> offersApplied = testCalc.getOffersApplied();
		assertEquals(3, offersApplied.get(0).getOfferCount());
		assertEquals("Beans 3 for 2", offersApplied.get(0).getOfferDescription());
	}
	
	@Test
	public void getOffersApplied_ShouldReturnOneOfferObjectPerOfferType() {
		SavingsCalculator testCalc = setupTestSavingsCalculator(3, 1);
		List<Offer> offersApplied = testCalc.getOffersApplied();
		assertEquals(2, offersApplied.size());
	}
	
	@Test
	public void getSavingsTotal_ShouldReturnBigDecimalTotalMoneySaved() {
		SavingsCalculator testCalc = setupTestSavingsCalculator(1, 1);
		BigDecimal expectedTotal = new BigDecimal("-0.90");
		assertTrue(expectedTotal.compareTo(testCalc.getSavingsTotal()) == 0);
	}
	
}
