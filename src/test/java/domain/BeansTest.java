package domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class BeansTest {
	
	@Test
	public void getDisplayName_ShouldReturnStaticDisplayNameVariable() {
		assertEquals(BeansItem.displayName, BeansItem.getDisplayName());
	}

	@Test
	public void setDisplayName_ShouldChangeStaticDisplayNameVariable() {
		String originalName = BeansItem.displayName;
		BeansItem.setDisplayName("Carrots");
		String newName = BeansItem.displayName;
		assertNotEquals(originalName, newName);
		assertEquals("Carrots", newName);
	}
	
	@Test
	public void getUnitPrice_ShouldReturnDoubleStaticUnitPriceVariable() {
		Double expectedPrice = 0.5;
		assertEquals(expectedPrice, BeansItem.getUnitPrice());
	}
	
	@Test
	public void setUnitPrice_ShouldChangeStaticUnitPriceVariable() {
		BeansItem.setUnitPrice(0.1);
		Double newPrice = BeansItem.unitPrice;
		Double expectedOriginalPrice = 0.5;
		Double expectedNewPrice = 0.1;
		assertNotEquals(expectedOriginalPrice, newPrice);
		assertEquals(expectedNewPrice, newPrice);
	}

}
