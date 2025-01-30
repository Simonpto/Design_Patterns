package PizzariaAbstractFactory;

import PizzariaAbstractFactory.Pizza.CheesePizza;
import PizzariaAbstractFactory.Pizza.ClamPizza;
import PizzariaAbstractFactory.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngridientFactory();
        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY Cheese Pizza");
        }
        else if(item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY Clam Pizza");
        }
        return pizza;
    }

    @Override
    public Pizza orderPizza(String item) {
        return createPizza(item);
    }
}
