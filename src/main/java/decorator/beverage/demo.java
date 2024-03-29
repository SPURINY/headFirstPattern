package decorator.beverage;

public class demo {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage=new Milk(beverage);//加一份mlk
        beverage=new Milk(beverage);//加第二份
        beverage=new Mocha(beverage);//加摩卡
        System.out.println(beverage.getDescription());
        System.out.println("-------");
        Beverage a= new Espresso();
        a= new Milk(new Mocha(a));
        System.out.println(a.getDescription());
    }
}
