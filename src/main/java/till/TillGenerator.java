package till;

import java.util.List;

import calculator.BasketCalculator;
import calculator.ItemsCalculator;
import calculator.SavingsCalculator;
import items.Item;

public class TillGenerator {
	
	private TillGenerator() {
		
	}
	
	public static final void newTill(List<Item> items) {
		new Till(new BasketCalculator(
				new ItemsCalculator(items), 
				new SavingsCalculator(items)
		));
	}

}
