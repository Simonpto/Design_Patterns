package Nyhedsbrevssystem;

public class MobileAppSubscriber implements Observer{
    @Override
    public void update(NewsletterService ns) {
        System.out.println("nu kan alle der har appen hente: " + ns.getNewsletters().getLast());
    }
}
