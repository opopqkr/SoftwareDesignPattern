package hansung.designpatterns.observer;

import java.sql.Time;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	TimedWeatherData timedWeatherData;
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
   /*public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}*/
	
	public void display() {
		System.out.println("[Time :"+timedWeatherData.getMeasuredTime()+" ]");
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Subject sub) {
		if(sub instanceof WeatherData){
			WeatherData weatherData = (WeatherData)sub;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			if(sub instanceof TimedWeatherData){
				timedWeatherData = (TimedWeatherData)sub;
			}
			display();
		}
	}
}
