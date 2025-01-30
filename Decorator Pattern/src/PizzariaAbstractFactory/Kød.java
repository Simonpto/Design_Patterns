package PizzariaAbstractFactory;

public class Kød extends AddOnTopping {
    public Kød(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getTopping() {
        return pizza.getDescription() + ", kød";
    }

    @Override
    public int cost() {
        return pizza.cost() + 10;
    }
}
