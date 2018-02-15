package hansung.designpatterns.observer;

import java.util.Timer;
import java.util.TimerTask;

public class WeatherStation {
		static TimedWeatherData timedWeatherData;
		static float temperature=80.0f;
		static float lastTemperature=80.0f;
		static float humidity=65.0f;
		static float pressure=30.0f;
		
		public static void main(String[] args) {
			timedWeatherData = new TimedWeatherData();
			CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(timedWeatherData);
			StatisticsDisplay statisticsDisplay = new StatisticsDisplay(timedWeatherData);
			ForecastDisplay forecastDisplay = new ForecastDisplay(timedWeatherData);
			
			
			Timer jobScheduler = new Timer();
			TimerTask task = new TimerTask() {
				public void run() {
					temperature = (float)(temperature+ Math.random()*0.1);
					humidity = (float)(humidity+ Math.random()*0.1);
					pressure = (float)(pressure+ Math.random()*0.1);
					timedWeatherData.setMeasurements(temperature, humidity, pressure);
				}
			};
			jobScheduler.schedule(task, 0, 1000);
		}
}
