package decorator.beverage;

public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.1+ beverage.cost();
    }

    @Override
    public String getDescription() {
        return "Milk"+beverage.getDescription();
    }
}
