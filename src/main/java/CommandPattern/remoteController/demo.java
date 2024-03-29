package CommandPattern.remoteController;

public class demo {
    public static void main(String[] args) {
        RemoteController control=new RemoteController();//遥控器
        Light light = new Light();//接收者
        TV tv = new TV();//接收者
        OnLightCommand onLightCommand = new OnLightCommand(light);
        OffLightCommand offLightCommand = new OffLightCommand(light);
        OnTVCommand onTVCommand = new OnTVCommand(tv);
        OffTVCommand offTVCommand = new OffTVCommand(tv);
        /*给遥控器槽口连接上电器*/
        control.SetCommand(0,onLightCommand,offLightCommand);
        control.SetCommand(1,onTVCommand,offTVCommand);
        /*按遥控器*/
        control.PressOnButton(1);
        control.PressOffButton(1);
        control.Undo();
        control.PressOnButton(0);
    }

}
