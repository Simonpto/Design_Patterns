package Nyhedsbrevssystem;

public class TestApp {
    public static void main(String[] args) {

        NewsletterService newsletterService = new NewsletterService();
        MobileAppSubscriber mobileAppSubscriber = new MobileAppSubscriber();
        EmailSubscriber emailSubscriber = new EmailSubscriber();
        Email email1 = new Email("hej@gmail.com");
        Email email2 = new Email("halløj@gmail.com");
        Email email3 = new Email("heyo@gmail.com");
        emailSubscriber.addEmail(email1);
        emailSubscriber.addEmail(email2);
        emailSubscriber.addEmail(email3);
        Newsletter newsletter1 = new Newsletter("Trump vil købe grønland");
        Newsletter newsletter2 = new Newsletter("Trump truer Danmark med købssanktioner");
        Newsletter newsletter3 = new Newsletter("Trump bliver til grin");
        //add observers
        newsletterService.registerObserver(mobileAppSubscriber);
        newsletterService.registerObserver(emailSubscriber);
        //add nyhedsbrev
        newsletterService.addNewsletter(newsletter1);
        //remove observer
        newsletterService.removeObserver(emailSubscriber);
        newsletterService.addNewsletter(newsletter2);
        newsletterService.registerObserver(emailSubscriber);
        newsletterService.addNewsletter(newsletter3);
    }
}
