package factory;

import observer.TemperatureDisplay;
import observer.WeatherObserver;

public class TemperatureDisplayFactory implements WeatherObserverFactory {
    @Override
    public WeatherObserver createWeatherObserver() {
        return new TemperatureDisplay();
    }
}
