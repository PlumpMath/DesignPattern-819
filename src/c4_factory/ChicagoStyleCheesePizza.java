package c4_factory;

public class ChicagoStyleCheesePizza extends APizza {

	public ChicagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish Chesse Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	void prepare() {
		// TODO Auto-generated method stub
		
	}
	

}
