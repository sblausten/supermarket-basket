package till;

import static org.mockito.Mockito.*;

import java.math.BigDecimal;

import org.junit.Test;

import calculator.BasketCalculator;

public class TillTest {

	private BasketCalculator mockBasketCalculator() {
		BasketCalculator mockCalc = mock(BasketCalculator.class);
		when(mockCalc.getItemsTotal()).thenReturn(new BigDecimal(5.5));
		when(mockCalc.getSavingsTotal()).thenReturn(new BigDecimal(-2.5));
		return mockCalc;
	}

	@Test
	public void getItemsTotal_ShouldCallGetItemsTotalOnBasketCalculator() {
		BasketCalculator mockCalc = mockBasketCalculator();
		Till testTill = new Till(mockCalc);
		testTill.getItemsTotal();
		verify(mockCalc, times(1)).getItemsTotal();
	}
	
	@Test
	public void getNetTotal_ShouldCallGetNetTotalOnBasketCalculator() {
		BasketCalculator mockCalc = mockBasketCalculator();
		Till testTill = new Till(mockCalc);
		testTill.getNetTotal();
		verify(mockCalc, times(1)).getNetTotal();
	}
	
	@Test
	public void getSavingsTotal_ShouldCallGetSavingsTotalOnBasketCalculator() {
		BasketCalculator mockCalc = mockBasketCalculator();
		Till testTill = new Till(mockCalc);
		testTill.getSavingsTotal();
		verify(mockCalc, times(1)).getSavingsTotal();
	}
	
	@Test
	public void getSavingsTotal_ShouldCallGetOffersAppliedOnBasketCalculator() {
		BasketCalculator mockCalc = mockBasketCalculator();
		Till testTill = new Till(mockCalc);
		testTill.getOffersApplied();
		verify(mockCalc, times(1)).getOffersApplied();
	}

}
