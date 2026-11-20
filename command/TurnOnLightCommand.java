public class TurnOnLightCommand extends LightCommand {
    public TurnOnLightCommand(Light light) {
        super(light);
    }

    @Override
    protected void apply(Light light) {
        light.turnOn();
    }
}
