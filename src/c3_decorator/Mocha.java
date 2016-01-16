package c3_decorator;

public class Mocha extends ACondimentDecorator {

	private ABeverage beverage;
	
	public Mocha(ABeverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return this.beverage.cost()+.20;
	}

}
