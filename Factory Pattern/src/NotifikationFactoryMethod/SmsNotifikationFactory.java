package NotifikationFactoryMethod;

public class SmsNotifikationFactory extends NotifikationFactory{

    @Override
    public Notifikation createNotification() {
        return new SmsNotifikation();
    }
}
