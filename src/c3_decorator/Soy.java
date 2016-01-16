package c3_decorator;

public class Soy extends ACondimentDecorator {
	
	private ABeverage beverage;
	
	public Soy (ABeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return this.beverage.cost()+.15;
	}

}
