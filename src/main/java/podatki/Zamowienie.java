package podatki;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {

    private int numerZamowienia;
    private String adresDostawy;
    private static List<Produkt> listaProduktow;

    KalkulatorPodatku kalkulatorPodatku = new KalkulatorPodatkuPolska();


    public static double obliczCeneZamowienia() {
        double suma = 0;
        for (Produkt produkt : listaProduktow) {
            suma += produkt.getCena();
        }
        return suma;
    }

    public double obliczPodatek(List<Produkt> listaProduktow) {
        this.listaProduktow = listaProduktow;
        return kalkulatorPodatku.obliczPodatek(listaProduktow);
    }
}
