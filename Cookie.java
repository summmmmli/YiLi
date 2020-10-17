package assignment5;

public class Cookie extends DessertItem {
	private int number;
	private int priceperdozen;
	private int cost;
	
	public Cookie(String name, int number, int priceperdozen) {
		super(name);
		this.number = number;
		this.priceperdozen = priceperdozen;
	}
	
	public int getCost() {
		cost = (int)Math.round(number / 12.0*priceperdozen);
		return cost;
	}

	public int getNumber() {
		return number;
	}

	public int getPricePerDozen() {
		return priceperdozen;
	}
}
