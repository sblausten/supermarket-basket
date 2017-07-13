package domain;

public class Coke implements Item {

	String name;
	Double price;
	
	public Coke() {
		setName("coke");
		setPrice(0.7);
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
