package decorator.beverage;
//浓缩咖啡(被装饰）
public class Espresso extends Beverage{
    public Espresso() {
        description="Espresso";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
