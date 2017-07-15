package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrangesTest {

	@Test
	public void getDisplayName_ShouldReturnStaticDisplayNameVariable() {
		assertEquals(Oranges.displayName, Oranges.getDisplayName());
	}

	@Test
	public void setDisplayName_ShouldChangeStaticDisplayNameVariable() {
		String originalName = Oranges.displayName;
		Oranges.setDisplayName("Carrots");
		String newName = Oranges.displayName;
		assertNotEquals(originalName, newName);
		assertEquals("Carrots", newName);
	}
	
	@Test
	public void getUnitPrice_ShouldReturnDoubleStaticUnitPriceVariable() {
		Double expectedPrice = 0.00199;
		assertEquals(expectedPrice, Oranges.getUnitPrice());
	}
	
	@Test
	public void setUnitPrice_ShouldChangeStaticUnitPriceVariable() {
		Oranges.setUnitPrice(0.1);
		Double newPrice = Oranges.unitPrice;
		Double expectedOriginalPrice = 0.5;
		Double expectedNewPrice = 0.1;
		assertNotEquals(expectedOriginalPrice, newPrice);
		assertEquals(expectedNewPrice, newPrice);
	}

}
