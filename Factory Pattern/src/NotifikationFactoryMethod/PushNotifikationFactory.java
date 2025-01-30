package NotifikationFactoryMethod;

public class PushNotifikationFactory extends NotifikationFactory{
    @Override
    public Notifikation createNotification() {
        return new PushNotifikation();
    }
}
