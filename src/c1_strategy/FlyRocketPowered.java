package c1_strategy;

public class FlyRocketPowered implements I_FlyBehavior {

	@Override
	public void fly() {
		System.out.println("i'm flying with a rocket!");
	}

}
