package podatki;

import java.util.List;

public class KalkulatorPodatkuUSA implements KalkulatorPodatku {

    private static final double PODATEK_WILEKOSC = 0.09;


    @Override
    public double obliczPodatek(List<Produkt> listaProduktow) {
        return Zamowienie.obliczCeneZamowienia() * PODATEK_WILEKOSC;
    }
}
