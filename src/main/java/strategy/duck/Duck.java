package strategy.duck;
/**
 * 鸭：Rub（不飞，不叫）,Wild（飞，嘎嘎）,City(不会飞，吱吱）
 * 所有鸭子都swim
 * -叫声不一样
 * -能否飞不一样
 * */
public class Duck {
    private IQuark q;
    private Ifly f;
    public void quarkBehavior(){
        q.quark();
    }

    public void flyBehavior(){
        f.fly();
    }
    public Duck() {//构造写死了
        q=new NoQuark();
        f=new FlyWithWings();
    }

    public IQuark getQ() {//但还可以通过setter动态修改行为
        return q;
    }

    public void setQ(IQuark q) {
        this.q = q;
    }

    public Ifly getF() {
        return f;
    }

    public void setF(Ifly f) {
        this.f = f;
    }

    public void swim(){
        System.out.println("所有鸭子都可以swim");
    }

}
