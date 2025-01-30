package PizzariaAbstractFactory;

import PizzariaAbstractFactory.Cheese.Cheese;
import PizzariaAbstractFactory.Cheese.MozzarellaCheese;
import PizzariaAbstractFactory.Clams.Clam;
import PizzariaAbstractFactory.Clams.FreshClam;
import PizzariaAbstractFactory.Dough.Dough;
import PizzariaAbstractFactory.Dough.ThickCrustDough;
import PizzariaAbstractFactory.Sauce.RedPepperSauce;
import PizzariaAbstractFactory.Sauce.Sauce;

public class ChicagoPizzaIngridientFactory implements PizzariaAbstractFactory.PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }
    @Override
    public Sauce createSauce() {
        return new RedPepperSauce();
    }
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
