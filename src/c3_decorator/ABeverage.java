package c3_decorator;

public abstract class ABeverage {

	String description = "Unknown Beverage";
	
	public String getDescription(){
		return this.description;
	}
	public abstract double cost();

}
