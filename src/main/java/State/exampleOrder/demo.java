package State.exampleOrder;

public class demo {
    /*
    * 实体类本身没有任何改变，根据每次委托的状态类不同显现出来-->调用同样的方法但结果不一样，看起来像方法变了的视觉
    * */
    public static void main(String[] args) {
        Unpay state1 = new Unpay();
        Order order = new Order(state1);
        order.doAction();
        System.out.println("--------------------");
        order.setState(new Payed());
        order.doAction();
        System.out.println("--------------------");
        order.setState(new Confirmed());
        order.doAction();
    }
}
