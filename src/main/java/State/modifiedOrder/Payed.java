package State.modifiedOrder;

public class Payed implements State {
    /*
     * 订单已付款状态
     * */
    Order order;

    public Payed(Order order) {
        this.order = order;
    }
    @Override
    public void makeOrder() {
        System.out.println("订单已存在");
    }

    @Override
    public void doPay() {
        System.out.println("已支付");
    }

    @Override
    public void doConfirm() {
        order.setState(order.getConfirm());//把当前状态修改成已确认
        System.out.println("确认成功--");
    }

    @Override
    public void negate() {
        order.setState(order.getNegate());
        System.out.println("订单取消成功--");
    }
}