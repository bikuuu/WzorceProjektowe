package observer;

public interface Observable {

    public void addListner(Listner observer);

    public void removeListner(Listner listner);

    public void notifyListners();
}
