package CommandPattern.remoteController;

public class OnLightCommand implements Command{
    Light light;

    public OnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
