package PizzariaAbstractFactory;

import PizzariaAbstractFactory.Cheese.Cheese;
import PizzariaAbstractFactory.Clams.Clam;
import PizzariaAbstractFactory.Dough.Dough;
import PizzariaAbstractFactory.Sauce.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clam createClam();
}
