package c2_observer_bis;

import java.util.Observable;

public class WeatherData extends Observable {
	
	private float temperature;
	private float humidiy;
	private float pressure;
	
	public float getTemperature() {
		return temperature;
	}
	public float getHumidiy() {
		return humidiy;
	}
	public float getPressure() {
		return pressure;
	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidiy = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}


}
