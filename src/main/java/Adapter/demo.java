package Adapter;

public class demo {
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        Duck adapterDuck=new TurkeyDuck(turkey);//用户只能看见是Duck，并不知道turkey的
        adapterDuck.fly();
        adapterDuck.quark();
    }
}
