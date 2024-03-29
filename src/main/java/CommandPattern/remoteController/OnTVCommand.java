package CommandPattern.remoteController;

public class OnTVCommand implements Command{
    TV tv;

    public OnTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
