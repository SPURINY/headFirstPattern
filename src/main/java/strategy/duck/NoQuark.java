package strategy.duck;

public class NoQuark implements IQuark{
    @Override
    public void quark() {
        System.out.println("不会叫");
    }
}
