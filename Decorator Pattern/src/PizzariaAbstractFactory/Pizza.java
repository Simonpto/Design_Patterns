package PizzariaAbstractFactory;

public abstract class Pizza {
    String description;
    public String getDescription(){
        return description = "unknown pizza";
    }
    public abstract int cost();
}
