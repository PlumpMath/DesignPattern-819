package c3_decorator;

public class HouseBlend extends ABeverage {

	@Override
	public String getDescription() {
		return "House Blend Coffee";
	}

	@Override
	public double cost() {
		return .89;
	}

}
