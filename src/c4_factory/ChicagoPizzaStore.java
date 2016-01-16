package c4_factory;

public class ChicagoPizzaStore extends APizzaStore {

	@Override
	APizza createPizza(String type) {
		switch(type) {
		case "cheese":
			return new ChicagoStyleCheesePizza();
		case "veggie":
			return new ChicagoStyleVeggiePizza();
		case "pepperoni":
			return new ChicagoStylePepperoniPizza();
		default:
			return null;
		}
	}

}
