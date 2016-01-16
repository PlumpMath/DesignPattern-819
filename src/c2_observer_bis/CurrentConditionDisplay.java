package c2_observer_bis;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, I_DisplayElement {

	private Observable observable;
	private float tempreature;
	private float humidity;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		WeatherData weatherData = (WeatherData)arg0;
		this.tempreature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidiy();
		this.display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + this.tempreature + "F degress and " + this.humidity + "% humidity");
	}

}
