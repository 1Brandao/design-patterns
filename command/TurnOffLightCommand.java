public class TurnOffLightCommand extends LightCommand {
    public TurnOffLightCommand(Light light) {
        super(light);
    }

    @Override
    protected void apply(Light light) {
        light.turnOff();
    }
}
