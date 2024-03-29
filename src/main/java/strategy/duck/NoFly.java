package strategy.duck;

public class NoFly implements Ifly{
    @Override
    public void fly() {
        System.out.println("NoFly无法飞行");
    }
}
