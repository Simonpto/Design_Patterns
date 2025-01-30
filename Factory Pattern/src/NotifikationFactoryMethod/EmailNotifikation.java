package NotifikationFactoryMethod;

public class EmailNotifikation extends Notifikation{
    @Override
    public void send(String message) {
        System.out.println("Sending Mail: " + message);
    }
}
