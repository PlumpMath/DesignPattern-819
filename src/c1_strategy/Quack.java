package c1_strategy;

public class Quack implements I_QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
