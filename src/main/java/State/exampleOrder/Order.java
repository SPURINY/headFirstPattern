package State.exampleOrder;

public class Order {
    /*
    * 订单本体
    * */
    State state;

    public Order() {
    }

    public Order(State state) {
        this.state = state;
    }
    public void doAction(){
        state.doAction();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
