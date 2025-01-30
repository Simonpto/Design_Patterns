package PizzariaAbstractFactory;

import PizzariaAbstractFactory.Pizza.Pizza;

public abstract class PizzaStore {
    public abstract Pizza orderPizza(String item);
}
