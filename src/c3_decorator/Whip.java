package c3_decorator;

public class Whip extends ACondimentDecorator {
	
	private ABeverage beverage;
	
	public Whip(ABeverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return this.beverage.cost()+.1;
	}

}
