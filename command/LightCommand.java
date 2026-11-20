import java.util.Objects;

abstract class LightCommand implements Command {
    private final Light light;
    private boolean wasOn;

    protected LightCommand(Light light) {
        this.light = Objects.requireNonNull(light, "Light is required");
    }

    @Override
    public final void execute() {
        wasOn = light.isOn();
        apply(light);
    }

    protected abstract void apply(Light light);

    @Override
    public final void undo() {
        if (wasOn) {
            light.turnOn();
        } else {
            light.turnOff();
        }
    }
}
