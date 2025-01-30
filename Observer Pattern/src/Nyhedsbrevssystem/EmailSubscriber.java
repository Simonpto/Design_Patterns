package Nyhedsbrevssystem;

import java.util.ArrayList;
import java.util.List;

public class EmailSubscriber implements Observer{
    private List<Email> emails = new ArrayList();
    @Override
    public void update(NewsletterService ns) {
        for (Email email : emails) {
            System.out.println("Det nye nyhedsbrev: " + ns.getNewsletters().getLast() + " til: " + email);
        }
    }
    public void addEmail(Email email){
        if(!emails.contains(email)){
            emails.add(email);
        }
    }
}
