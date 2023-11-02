package factory;

import observer.HumidityDisplay;
import observer.WeatherObserver;

public class HumidityDisplayFactory implements WeatherObserverFactory {
    @Override
    public WeatherObserver createWeatherObserver() {
        return new HumidityDisplay();
    }
}
