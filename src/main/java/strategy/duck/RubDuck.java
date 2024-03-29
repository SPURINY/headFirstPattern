package strategy.duck;

public class RubDuck extends Duck{
    //鸭：Rub（不飞，不叫）,Wild（飞，嘎嘎）,City(不会飞，吱吱）
    private IQuark q=new NoQuark();
    private Ifly f=new NoFly();
}
