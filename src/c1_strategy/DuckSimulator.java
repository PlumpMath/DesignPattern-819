package c1_strategy;

public class DuckSimulator {
	public static void main(String[] args){
		A_Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		A_Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
