package observer;

public class HumidityDisplay implements WeatherObserver {
    @Override
    public void update(float temperature) {
        System.out.println("Humidity Display: Humidity is 60%");
    }
}
