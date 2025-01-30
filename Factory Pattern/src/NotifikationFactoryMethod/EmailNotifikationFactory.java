package NotifikationFactoryMethod;

public class EmailNotifikationFactory extends NotifikationFactory{
    @Override
    public Notifikation createNotification() {
        return new EmailNotifikation();
    }
}
