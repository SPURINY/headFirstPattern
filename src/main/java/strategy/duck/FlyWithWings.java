package strategy.duck;

public class FlyWithWings implements Ifly{
    @Override
    public void fly() {
        System.out.println("FlyWithWings用翅膀飞");
    }
}
