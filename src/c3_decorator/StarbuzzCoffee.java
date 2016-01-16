package c3_decorator;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		ABeverage beverage = new Expresso();
		System.out.println(beverage.getDescription() + " €" + beverage.cost());
		
		ABeverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " €" + beverage2.cost());
	}

}
