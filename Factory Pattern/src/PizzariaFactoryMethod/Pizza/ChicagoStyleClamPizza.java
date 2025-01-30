package PizzariaFactoryMethod.Pizza;

public class ChicagoStyleClamPizza extends Pizza{
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Thick Crust Dough";
        sauce = "White Sauce";
        toppings.add("Feta Cheese");
        toppings.add("Frozen Clam");
    }
    public void cut(){
        System.out.println("Cutting in squares");
    }
}
