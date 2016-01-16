package c1_strategy;

public class Squeak implements I_QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
