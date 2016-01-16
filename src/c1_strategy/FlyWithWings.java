package c1_strategy;

public class FlyWithWings implements I_FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying!!");
	}

}
