package State.modifiedOrder;

public class Unpay implements State {
    /*
     * 订单未支付状态
     * */
    Order order;

    public Unpay(Order order) {
        this.order = order;
    }

    @Override
    public void negate() {
        order.setState(order.getNegate());
        System.out.println("订单取消成功--");
    }

    @Override
    public void makeOrder() {
        System.out.println("订单已存在");
    }

    @Override
    public void doPay() {
        order.setState(order.getPayed());//把当前状态修改成已支付
        System.out.println("支付成功");
    }

    @Override
    public void doConfirm() {
        System.out.println("请先支付");
    }
}
