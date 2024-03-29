package CommandPattern.remoteController;

public class NoCommand implements Command{
    /*
    * 空的命令，用来装填 还没分配的按钮（在遥控器构造函数初始化时用到了
    * */
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
