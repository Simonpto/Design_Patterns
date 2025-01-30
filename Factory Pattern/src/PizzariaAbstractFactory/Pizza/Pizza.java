package PizzariaAbstractFactory.Pizza;

import PizzariaAbstractFactory.Cheese.Cheese;
import PizzariaAbstractFactory.Clams.Clam;
import PizzariaAbstractFactory.Dough.Dough;
import PizzariaAbstractFactory.Sauce.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clam clam;
    public abstract void prepare();
    void bake(){
        System.out.println("Bakes for 25 minutes at 300.");
    }
    void cut(){
        System.out.println("Cut in cirkles.");
    }
    void box(){
        System.out.println("Put it in original box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", clam=" + clam +
                '}';
    }
}
