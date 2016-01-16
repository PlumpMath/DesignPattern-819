package c1_strategy;

public class FlyNoWay implements I_FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly.");
	}

}
