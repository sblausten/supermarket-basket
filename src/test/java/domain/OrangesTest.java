package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrangesTest {

	@Test
	public void getDisplayName_ShouldReturnStaticDisplayNameVariable() {
		assertEquals(OrangesItem.displayName, OrangesItem.getDisplayName());
	}

	@Test
	public void setDisplayName_ShouldChangeStaticDisplayNameVariable() {
		String originalName = OrangesItem.displayName;
		OrangesItem.setDisplayName("Carrots");
		String newName = OrangesItem.displayName;
		assertNotEquals(originalName, newName);
		assertEquals("Carrots", newName);
	}
	
	@Test
	public void getUnitPrice_ShouldReturnDoubleStaticUnitPriceVariable() {
		Double expectedPrice = 0.00199;
		assertEquals(expectedPrice, OrangesItem.getUnitPrice());
	}
	
	@Test
	public void setUnitPrice_ShouldChangeStaticUnitPriceVariable() {
		OrangesItem.setUnitPrice(0.1);
		Double newPrice = OrangesItem.unitPrice;
		Double expectedOriginalPrice = 0.5;
		Double expectedNewPrice = 0.1;
		assertNotEquals(expectedOriginalPrice, newPrice);
		assertEquals(expectedNewPrice, newPrice);
	}

}
