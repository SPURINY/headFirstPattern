package State.exampleOrder;

public class Unpay implements State{
    /*
     * 订单未支付状态
     * */
    @Override
    public void doAction() {
        System.out.println("订单未支付");
    }
}
