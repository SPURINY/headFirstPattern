package CommandPattern.remoteController;

public class OffTVCommand implements Command{
    TV tv;

    public OffTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
