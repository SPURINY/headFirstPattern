package decorator.beverage;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.1+ beverage.cost();
    }

    @Override
    public String getDescription() {
        return "Mocha"+beverage.getDescription();
    }
}
