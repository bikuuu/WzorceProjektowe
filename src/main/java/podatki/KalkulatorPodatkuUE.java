package podatki;

import java.util.List;

public class KalkulatorPodatkuUE implements KalkulatorPodatku {

    private static final double PODATEK_WILEKOSC = 0.16;

    @Override
    public double obliczPodatek(List<Produkt> listaProduktow) {
        return Zamowienie.obliczCeneZamowienia() * PODATEK_WILEKOSC;
    }
}
