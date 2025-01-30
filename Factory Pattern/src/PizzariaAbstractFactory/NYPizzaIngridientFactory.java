package PizzariaAbstractFactory;

import PizzariaAbstractFactory.Cheese.Cheese;
import PizzariaAbstractFactory.Cheese.RiggianoCheese;
import PizzariaAbstractFactory.Clams.Clam;
import PizzariaAbstractFactory.Clams.ForzenClam;
import PizzariaAbstractFactory.Dough.Dough;
import PizzariaAbstractFactory.Dough.ThinCrustDough;
import PizzariaAbstractFactory.Sauce.Sauce;
import PizzariaAbstractFactory.Sauce.WhiteSauce;

public class NYPizzaIngridientFactory implements PizzariaAbstractFactory.PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }
    @Override
    public Sauce createSauce() {
        return new WhiteSauce();
    }
    @Override
    public Cheese createCheese() {
        return new RiggianoCheese();
    }
    @Override
    public Clam createClam() {
        return new ForzenClam();
    }
}
