package c1_strategy;



public abstract class A_Duck {

	I_FlyBehavior flyBehavior;
	I_QuackBehavior quackBehavior;
	
	public A_Duck() {}
	
	
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}



	public void setFlyBehavior(I_FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}



	public void setQuackBehavior(I_QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
