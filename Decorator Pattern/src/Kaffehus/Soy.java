package Kaffehus;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Kaffehus.Soy";
    }
    public double cost() {
        return beverage.cost() + .15;
    }
}
