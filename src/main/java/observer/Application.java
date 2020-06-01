package observer;

public class Application {


    public static void main(String[] args) {
        Button button = new Button();
        EmailSender emailSender = new EmailSender();
        SmsSender smsSender = new SmsSender();
        button.addListner(emailSender);
        button.addListner(smsSender);
        button.click();
    }
}
