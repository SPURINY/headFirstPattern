package strategy.duck;

public class CityDuck extends Duck{
    //鸭：Rub（不飞，不叫）,Wild（飞，嘎嘎）,City(不会飞，吱吱）
    private IQuark q=new Zhizhi();
    private Ifly f=new NoFly();
}
