package PizzariaAbstractFactory;

public class DeepPanPizza extends Pizza{
    public DeepPanPizza() {
        description = "Deep pan pizza";
    }

    @Override
    public int cost() {
        return 80;
    }
}
