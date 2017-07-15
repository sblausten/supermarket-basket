package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class CokeTest {

	@Test
	public void getDisplayName_ShouldReturnStaticDisplayNameVariable() {
		assertEquals(Coke.displayName, Coke.getDisplayName());
	}

	@Test
	public void setDisplayName_ShouldChangeStaticDisplayNameVariable() {
		String originalName = Coke.displayName;
		Coke.setDisplayName("Carrots");
		String newName = Coke.displayName;
		assertNotEquals(originalName, newName);
		assertEquals("Carrots", newName);
	}
	
	@Test
	public void getUnitPrice_ShouldReturnDoubleStaticUnitPriceVariable() {
		Double expectedPrice = 0.7;
		assertEquals(expectedPrice, Coke.getUnitPrice());
	}
	
	@Test
	public void setUnitPrice_ShouldChangeStaticUnitPriceVariable() {
		Coke.setUnitPrice(0.1);
		Double newPrice = Coke.unitPrice;
		Double expectedOriginalPrice = 0.5;
		Double expectedNewPrice = 0.1;
		assertNotEquals(expectedOriginalPrice, newPrice);
		assertEquals(expectedNewPrice, newPrice);
	}

}
