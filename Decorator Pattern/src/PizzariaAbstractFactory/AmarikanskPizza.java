package PizzariaAbstractFactory;

public class AmarikanskPizza extends Pizza {
    public AmarikanskPizza() {
        description = "Amarikansk Pizza";
    }

    @Override
    public int cost() {
        return 70;
    }
}
