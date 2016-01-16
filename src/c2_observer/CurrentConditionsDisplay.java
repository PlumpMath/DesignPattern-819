package c2_observer;

public class CurrentConditionsDisplay implements I_Observer, I_DisplayElement {

	private float temperature;
	private float humidity;
	private I_Subject weatherData;
	
	public CurrentConditionsDisplay(I_Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions : " + temperature + " F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.display();
	}

}
