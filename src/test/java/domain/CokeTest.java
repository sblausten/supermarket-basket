package domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class CokeTest {

	@Test
	public void getDisplayName_ShouldReturnStaticDisplayNameVariable() {
		assertEquals(CokeItem.displayName, CokeItem.getDisplayName());
	}

	@Test
	public void setDisplayName_ShouldChangeStaticDisplayNameVariable() {
		String originalName = CokeItem.displayName;
		CokeItem.setDisplayName("Carrots");
		String newName = CokeItem.displayName;
		assertNotEquals(originalName, newName);
		assertEquals("Carrots", newName);
	}
	
	@Test
	public void getUnitPrice_ShouldReturnDoubleStaticUnitPriceVariable() {
		Double expectedPrice = 0.7;
		assertEquals(expectedPrice, CokeItem.getUnitPrice());
	}
	
	@Test
	public void setUnitPrice_ShouldChangeStaticUnitPriceVariable() {
		CokeItem.setUnitPrice(0.1);
		Double newPrice = CokeItem.unitPrice;
		Double expectedOriginalPrice = 0.5;
		Double expectedNewPrice = 0.1;
		assertNotEquals(expectedOriginalPrice, newPrice);
		assertEquals(expectedNewPrice, newPrice);
	}

}
