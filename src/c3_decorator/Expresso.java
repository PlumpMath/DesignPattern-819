package c3_decorator;

public class Expresso extends ABeverage {
	
	@Override
	public String getDescription() {
		return "Expresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
