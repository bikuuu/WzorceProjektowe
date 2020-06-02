package podatki;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        KalkulatorPodatku kalkulatorPodatku = new KalkulatorPodatkuPolska();
        Produkt produkt1 = new Produkt("Komputer",2000);
        Produkt produkt2 = new Produkt("Myszka",20);
        List<Produkt> produktList = new ArrayList<>();
        produktList.add(produkt1);
        produktList.add(produkt2);

        Zamowienie zamowienie = new Zamowienie();
        System.out.println(zamowienie.obliczPodatek(produktList));

    }
}
