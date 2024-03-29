package CommandPattern.remoteController;

public class RemoteController {
    /*
    * 遥控器（请求者）
    * 遥控器有n对按钮（开，关），且这些按钮的接口未来换成别的电器也可以
    * */
    Command onCommands[];
    Command offCommands[];
    Command undoCommand;//撤销刚刚的操作，用来存储刚做的操作

    public RemoteController() {
        this.onCommands = new Command[4];
        this.offCommands =new Command[4];

        for(int i=0;i<onCommands.length;i++){///*****
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();
        }
    }
    public void SetCommand(int slot,Command on,Command off){//给xx槽的按钮连接电器
        onCommands[slot]=on;
        offCommands[slot]=off;
    }
    public void PressOnButton(int num){
        onCommands[num].execute();
        undoCommand=onCommands[num];//撤销刚刚的操作，用来存储刚做的操作
    }
    public void PressOffButton(int num){
        offCommands[num].execute();
        undoCommand=onCommands[num];
    }
    public void Undo(){
        undoCommand.undo();//原来写undo()方法只是为了给撤销用，，是不是有点浪费，，，
    }
}
