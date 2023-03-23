public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentDisplay =
                new CurrentConditions(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(70, 60, 30f);
        weatherData.setMeasurements(80, 80, 29.92f);
        weatherData.setMeasurements(58, 70, 25f);
    }
}
