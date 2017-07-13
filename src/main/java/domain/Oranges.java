package domain;

public class Oranges implements Item {

	String name;
	Double price;
	
	public Oranges() {
		setName("oranges");
		setPrice(0.00199);
	}
	
	@Override
	public String getName() {;
		return name;
	}
	
	@Override
	public void setName(String itemName) {
		name = itemName;
	}
	
	@Override
	public Double getPrice() {
		return price;
	}
	
	@Override
	public void setPrice(Double itemPrice) {
		price = itemPrice;
	}

}
