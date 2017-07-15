package domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class BeansTest {
	
	@Test
	public void getDisplayName_ShouldReturnStaticDisplayNameVariable() {
		assertEquals(Beans.displayName, Beans.getDisplayName());
	}

	@Test
	public void setDisplayName_ShouldChangeStaticDisplayNameVariable() {
		String originalName = Beans.displayName;
		Beans.setDisplayName("Carrots");
		String newName = Beans.displayName;
		assertNotEquals(originalName, newName);
		assertEquals("Carrots", newName);
	}
	
	@Test
	public void getUnitPrice_ShouldReturnDoubleStaticUnitPriceVariable() {
		Double expectedPrice = 0.5;
		assertEquals(expectedPrice, Beans.getUnitPrice());
	}
	
	@Test
	public void setUnitPrice_ShouldChangeStaticUnitPriceVariable() {
		Beans.setUnitPrice(0.1);
		Double newPrice = Beans.unitPrice;
		Double expectedOriginalPrice = 0.5;
		Double expectedNewPrice = 0.1;
		assertNotEquals(expectedOriginalPrice, newPrice);
		assertEquals(expectedNewPrice, newPrice);
	}

}
