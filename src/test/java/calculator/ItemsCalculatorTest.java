package calculator;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import items.Item;

public class ItemsCalculatorTest {

	@Test
	public void getItemsTotal_ShouldReturnCorrectTotalPrice() {
		MockItemListHelper Mock = new MockItemListHelper();
		List<Item> items = Mock.mockItemList(Mock.mockItem50p(), 2);	
		ItemsCalculator testCalc = new ItemsCalculator(items);
		BigDecimal expectedTotal = new BigDecimal("1.00");
		assertTrue(expectedTotal.compareTo(testCalc.getItemsTotal()) == 0);
	}
	
	@Test
	public void getItemsTotal_ShouldRoundCorrectTotalPriceTwoDecimalPlaces() {
		MockItemListHelper Mock = new MockItemListHelper();
		List<Item> items = Mock.mockItemList(Mock.mockItem014p(), 2);
		ItemsCalculator testCalc = new ItemsCalculator(items);
		BigDecimal expectedTotal = new BigDecimal("0.03");
		System.out.println(testCalc.getItemsTotal());
		assertTrue(expectedTotal.compareTo(testCalc.getItemsTotal()) == 0);
	}

}
