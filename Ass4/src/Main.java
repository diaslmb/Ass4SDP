import observer.ConcreteWeatherStation;
import factory.TemperatureDisplayFactory;
import factory.HumidityDisplayFactory;
import observer.WeatherObserver;
import factory.WeatherObserverFactory;

public class Main {
    public static void main(String[] args) {
        ConcreteWeatherStation weatherStation = new ConcreteWeatherStation();

        WeatherObserverFactory temperatureFactory = new TemperatureDisplayFactory();
        WeatherObserverFactory humidityFactory = new HumidityDisplayFactory();

        WeatherObserver temperatureDisplay = temperatureFactory.createWeatherObserver();
        WeatherObserver humidityDisplay = humidityFactory.createWeatherObserver();

        weatherStation.addObserver(temperatureDisplay);
        weatherStation.addObserver(humidityDisplay);

        weatherStation.setTemperature(25.5f);
    }
}
