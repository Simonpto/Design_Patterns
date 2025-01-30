package NotifikationFactoryMethod;

public class PushNotifikation extends Notifikation{
    @Override
    public void send(String message) {
        System.out.println("Sending push: " + message);
    }
}
