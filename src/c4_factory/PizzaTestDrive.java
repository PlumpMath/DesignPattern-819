package c4_factory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		APizzaStore nyStore = new NYPizzaStore();
		APizzaStore chicagoStore = new ChicagoPizzaStore();
		
		APizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}

}
