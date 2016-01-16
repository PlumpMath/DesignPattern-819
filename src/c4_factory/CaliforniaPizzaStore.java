package c4_factory;

public class CaliforniaPizzaStore extends APizzaStore {

	@Override
	APizza createPizza(String type) {
		switch(type) {
		case "cheese":
			return new CaliforniaStyleCheesePizza();
		case "veggie":
			return new CaliforniaStyleVeggiePizza();
		case "pepperoni":
			return new CaliforniaStylePepperoniPizza();
		default:
			return null;
		}
	}

}
