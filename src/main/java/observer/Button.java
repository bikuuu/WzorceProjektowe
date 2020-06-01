package observer;

import java.util.ArrayList;
import java.util.List;

public class Button implements Observable {
    private List<Listner> listnerList;

    public Button() {
        listnerList = new ArrayList<>();
    }

    @Override
    public void addListner(Listner observer) {
        listnerList.add(observer);
    }

    @Override
    public void removeListner(Listner listner) {
        listnerList.remove(listner);
    }

    @Override
    public void notifyListners() {
        for (Listner listner : listnerList) {
            listner.update();
        }
    }

    public void click() {
        notifyListners();
    }
}
