package Kaffehus;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }
    public double cost() {
        return beverage.cost() + .10;
    }
}
