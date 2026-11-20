import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WeatherStation implements TemperatureSubject {
    private final List<TemperatureObserver> observers = new ArrayList<>();
    private double temperature;

    @Override
    public void addObserver(TemperatureObserver observer) {
        Objects.requireNonNull(observer, "observer");
        if (observers.stream().noneMatch(registered -> registered == observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(TemperatureObserver observer) {
        Objects.requireNonNull(observer, "observer");
        observers.removeIf(registered -> registered == observer);
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (TemperatureObserver observer : observers) {
            observer.update(temperature);
        }
    }
}
