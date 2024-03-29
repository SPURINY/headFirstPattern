package CommandPattern.remoteController;

public class Light {
    /*
    * 灯(receiver)
    * */
    void on(){
        System.out.println("灯已打开--");
    }
    void off(){
        System.out.println("灯已关闭--");
    }
}
