package Adapter;

public class TurkeyDuck implements Duck{//适配成Duck的Turkey
    Turkey turkey;

    public TurkeyDuck(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        for(int i=0;i<5;i++){
            turkey.shortFly();//火鸡只会短距离飞，扇五次才赶上duck
        }
    }

    @Override
    public void quark() {
        turkey.goggle();
    }
}
