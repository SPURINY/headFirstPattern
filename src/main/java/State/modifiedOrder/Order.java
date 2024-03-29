package State.modifiedOrder;

public class Order {
    /*
    * 订单本体
    * 实现不用用户指定状态，自动修改状态
    * */
    private State unpay;
    private State payed;
    private State confirm;
    private State negate;
    private State state;
  /*  private State state=unpay;//假设当前状态为未支付
  * 在Java中，实例变量的初始化是在构造函数之前进行的，因此在构造函数中将state设置为unpay是不正确的。
  * 这会导致state仍然为null，从而引发空指针异常。
  * solution:所以我改到构造函数里了
  * */

    public Order() {
        unpay=new Unpay(this);//this指当前order类，详情参见Unpay的具体构造方法******
        payed=new Payed(this);
        confirm=new Confirmed(this);
        negate=new Negate(this);

        state=unpay;
    }
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doNegate(){
        state.negate();
    }
    public void makeOrder() {
        state.makeOrder();
    }

    public void doPay() {
        state.doPay();
    }

    public void doConfirm() {
        state.doConfirm();
    }

    public State getUnpay() {
        return unpay;
    }

    public void setUnpay(State unpay) {
        this.unpay = unpay;
    }

    public State getPayed() {
        return payed;
    }

    public void setPayed(State payed) {
        this.payed = payed;
    }

    public State getConfirm() {
        return confirm;
    }

    public void setConfirm(State confirm) {
        this.confirm = confirm;
    }

    public State getNegate() {
        return negate;
    }

    public void setNegate(State negate) {
        this.negate = negate;
    }
}
