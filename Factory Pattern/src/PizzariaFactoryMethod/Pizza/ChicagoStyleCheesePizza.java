package PizzariaFactoryMethod.Pizza;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Thick Crust Dough";
        sauce = "White Sauce";
        toppings.add("Feta Cheese");
    }
    public void cut(){
        System.out.println("Cutting in squares");
    }
}
