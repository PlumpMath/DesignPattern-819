package c1_strategy;

public class MuteQuack implements I_QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<< silence >>");
	}

}
