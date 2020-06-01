package observer;

public class SmsSender implements Listner {

    @Override
    public void update() {
        System.out.println("Send SMS");
    }
}
