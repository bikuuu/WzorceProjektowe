package observer;

public class EmailSender implements Listner{

    @Override
    public void update() {
        System.out.println("Send emial");
    }
}
