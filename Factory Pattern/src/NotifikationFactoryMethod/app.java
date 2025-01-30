package NotifikationFactoryMethod;

public class app {
    public static void main(String[] args) {
        NotifikationFactory emailFactory = new EmailNotifikationFactory();
        Notifikation emailNotifikation = emailFactory.createNotification();
        emailNotifikation.send("Send via Email");

        NotifikationFactory smsFactory = new SmsNotifikationFactory();
        Notifikation smsNotifikation = smsFactory.createNotification();
        smsNotifikation.send("Send via SMS");

        NotifikationFactory pushFactory = new PushNotifikationFactory();
        Notifikation pushNotifikation = pushFactory.createNotification();
        pushNotifikation.send("Send via Push");}
}
