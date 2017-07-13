package domain;

public class Beans implements Item {
	
	String name;
	Double price;
	
	public Beans() {
		setName("beans");
		setPrice(0.5);
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
