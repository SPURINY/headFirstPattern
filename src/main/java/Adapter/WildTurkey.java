package Adapter;

public class WildTurkey implements Turkey {
    @Override
    public void goggle() {
        System.out.println("wildTurkey gogle");
    }

    @Override
    public void shortFly() {
        System.out.println("wildTurkey shortFly");
    }
}
