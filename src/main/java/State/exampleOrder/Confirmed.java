package State.exampleOrder;

public class Confirmed implements State{
    /*
    * 订单已确认状态
    * */
    @Override
    public void doAction() {
        System.out.println("订单已完成");
    }
}
