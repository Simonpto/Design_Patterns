package PizzariaFactoryMethod.PizzaStore;


import PizzariaFactoryMethod.Pizza.NYStyleCheesePizza;
import PizzariaFactoryMethod.Pizza.NYStyleClamPizza;
import PizzariaFactoryMethod.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new NYStyleCheesePizza();
        else if(type.equals("clam"))
            return new NYStyleClamPizza();
        return null;
    }
}
