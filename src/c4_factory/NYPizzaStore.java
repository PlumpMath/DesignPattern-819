package c4_factory;

public class NYPizzaStore extends APizzaStore {

	@Override
	APizza createPizza(String type) {
		APizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		switch(type) {
		case "cheese":
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New york Style Cheese Pizza");
		case "clam":
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New york Style Clam Pizza");
		}
		return pizza;
	}

}
