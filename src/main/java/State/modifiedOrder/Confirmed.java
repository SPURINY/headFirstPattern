package State.modifiedOrder;

public class Confirmed implements State {
    /*
     * 订单已确认状态
     * */
    Order order;//实现通过order修改状态

    public Confirmed(Order order) {
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
        System.out.println("已确认");
    }
    @Override
    public void negate() {
        System.out.println("订单已确认，无法取消");
    }
}