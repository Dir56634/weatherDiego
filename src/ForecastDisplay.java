public class ForecastDisplay implements Observer, DisplayElement {

    private float normal = 29.92f;
    private float actual = 29.92f;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        actual = pressure;

        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (actual > normal) {
            System.out.println("El clima esta mejorando positivamente");
        } else if (actual == normal) {
            System.out.println("El clima esta normal");
        } else if (actual < normal) {
            System.out.println("El clima se viene lluvioso y frio");
        }
    }
}
