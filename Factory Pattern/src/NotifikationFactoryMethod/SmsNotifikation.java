package NotifikationFactoryMethod;

public class SmsNotifikation extends Notifikation{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
