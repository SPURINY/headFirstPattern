package strategy.duck;

public class testClass {
    public static void main(String[] args) {
        Duck city=new CityDuck();
        city.swim();
        city.flyBehavior();
        city.quarkBehavior();
        System.out.println("----------");
        Duck rub=new RubDuck();
        rub.swim();
        rub.flyBehavior();
        rub.quarkBehavior();
        System.out.println("----------");
        Duck customed=new Duck();
        customed.quarkBehavior();
        customed.flyBehavior();
        //动态修改了哈↓
        customed.setF(new FlyWithWings());
        customed.setQ(new Zhizhi());
        customed.quarkBehavior();
        customed.flyBehavior();
    }
}
