package hansung.designpatterns.observer;

import java.util.Date;

/**
 * Created by Park Chan mo on 2017-09-14.
 */
public class TimedWeatherData extends WeatherData {
    private String measuredTime;

    public void setMeasurements(float temperature, float humidity, float pressure) {
        measuredTime = new Date().toString();
        super.setMeasurements(temperature, humidity, pressure);
    }

    public String getMeasuredTime() {
        return measuredTime;
    }
}
