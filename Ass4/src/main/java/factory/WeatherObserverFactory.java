package factory;

import observer.WeatherObserver;

public interface WeatherObserverFactory {
    WeatherObserver createWeatherObserver();
}
