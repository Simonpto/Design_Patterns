package PizzariaFactoryMethod.PizzaStore;

import PizzariaFactoryMethod.Pizza.*;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new ChicagoStyleCheesePizza();
        else if(type.equals("clam"))
            return new ChicagoStyleClamPizza();
        return null;
    }
}
