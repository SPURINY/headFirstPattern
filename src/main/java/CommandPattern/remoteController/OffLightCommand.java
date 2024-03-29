package CommandPattern.remoteController;

public class OffLightCommand implements Command{
    Light light;

    public OffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
