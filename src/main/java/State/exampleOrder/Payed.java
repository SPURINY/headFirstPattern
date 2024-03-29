package State.exampleOrder;

public class Payed implements State{
    /*
     * 订单已付款状态
     * */
    @Override
    public void doAction() {
        System.out.println("订单已成功支付");
    }
}
