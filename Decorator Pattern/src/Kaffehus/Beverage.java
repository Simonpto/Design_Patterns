package Kaffehus;

public abstract class Beverage {
    String description = "Unknown Kaffehus.Beverage";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}