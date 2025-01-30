package Kaffehus;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Kaffehus.Mocha";
    }
    public double cost() {
        return beverage.cost() + .20;
    }
}