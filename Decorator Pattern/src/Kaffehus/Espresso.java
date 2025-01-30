package Kaffehus;

public class Espresso extends Beverage{
    public Espresso() {
        description = "Kaffehus.Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
