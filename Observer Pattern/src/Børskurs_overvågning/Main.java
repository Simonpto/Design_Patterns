package Børskurs_overvågning;

public class Main {
    public static void main(String[] args) {
        Aktie apple = new Aktie("Apple", 150.0);
        Aktie tesla = new Aktie("Tesla", 650.0);

        Bruger bruger1 = new Bruger("Alice");
        Bruger bruger2 = new Bruger("Bob");

        apple.registerObserver(bruger1);
        tesla.registerObserver(bruger2);

        apple.buyAktie(bruger1, 10);
        tesla.buyAktie(bruger2, 5);

        System.out.println("Opdatering af aktiekurser:");
        apple.kursændring(160.0);
        tesla.kursændring(630.0);

        apple.sellAktie(bruger1, 3);
        tesla.sellAktie(bruger2, 2);

        System.out.println("\nEfter aktiesalg:");
        apple.kursændring(155.0);
        tesla.kursændring(640.0);

        apple.sellAll(bruger1);
        tesla.sellAll(bruger2);
    }
}
