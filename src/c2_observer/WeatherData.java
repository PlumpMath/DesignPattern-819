package c2_observer;

import java.util.ArrayList;

public class WeatherData implements I_Subject {

	private ArrayList<I_Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		this.observers = new ArrayList<I_Observer>();
	}
	
	@Override
	public void registerObserver(I_Observer o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(I_Observer o) {
		int i = observers.indexOf(0);
		if(i>=0)
			observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(I_Observer o:observers) {
			o.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		this.notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}

}
