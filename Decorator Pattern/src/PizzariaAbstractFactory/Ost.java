package PizzariaAbstractFactory;

public class Ost extends AddOnTopping{

    public Ost(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getTopping() {
        return pizza.getDescription() + ", ost" ;
    }

    @Override
    public int cost() {
        return pizza.cost() + 5;
    }
}
