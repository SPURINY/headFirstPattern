package State.modifiedOrder;

public interface State {
    void makeOrder();//下单。还没支付
    void  doPay();//支付
    void doConfirm();//确认订单
    void negate();//取消订单
}
