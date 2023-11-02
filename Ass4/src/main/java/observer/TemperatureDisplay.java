package observer;

public class TemperatureDisplay implements WeatherObserver {
    @Override
    public void update(float temperature) {
        System.out.println("Temperature Display: Temperature is " + temperature + "°C");
    }
}
