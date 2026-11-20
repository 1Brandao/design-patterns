public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        TemperatureObserver display = new CurrentConditionsDisplay();
        TemperatureObserver alert = new TemperatureAlert();
        station.addObserver(display);
        station.addObserver(alert);
        station.addObserver(display);

        station.setTemperature(28.0);
        station.setTemperature(36.0);
        station.removeObserver(alert);
        station.setTemperature(38.0);
        station.removeObserver(display);
        station.setTemperature(40.0); // No observers remain, so this is silent.

        WeatherStation averagingStation = new WeatherStation();
        averagingStation.addObserver(new AverageTemperatureDisplay());
        averagingStation.setTemperature(20.0);
        averagingStation.setTemperature(30.0);
        averagingStation.setTemperature(40.0);
    }
}
