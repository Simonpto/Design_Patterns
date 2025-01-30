package PizzariaAbstractFactory;

import PizzariaAbstractFactory.Pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        pizza.prepare();
        System.out.println(pizza);
    }
}