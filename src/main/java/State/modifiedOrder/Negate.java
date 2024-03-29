package State.modifiedOrder;

public class Negate implements State {
    /*
     * 没有订单状态
     * */
    Order order;

    public Negate(Order order) {
        this.order = order;
    }

    @Override
    public void negate() {
        System.out.println("没有订单，所以无法取消");
    }

    @Override
    public void makeOrder() {

        order.setState(order.getUnpay());//创建订单，并初始为未支付状态
        System.out.println("order创建成功--");
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
