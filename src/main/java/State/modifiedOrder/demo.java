package State.modifiedOrder;

public class demo {
    /*
    * 实体类本身没有任何改变，根据每次委托的状态类不同显现出来-->调用同样的方法但结果不一样，看起来像方法变了的视觉
    * */
    public static void main(String[] args) {
        Order order = new Order();
        order.doConfirm();//刚闯出来默认未支付，无法确认
        System.out.println("---------");
        order.doPay();//支付
        order.doNegate();//取消ok
        order.doNegate();//取消失败，已经取消了
        System.out.println("----------");
        order.makeOrder();//创建订单，未支付状态
        order.doPay();//支付
        order.doConfirm();//确认
        order.doNegate();//取消ok失败
    }
}
