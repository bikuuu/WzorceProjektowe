package fluentBuilder;

import fluentBuilder.Lekarz.Zmiana;

public final class LekarzFluentBuilder {

    private String imie;
    private String nazwisko;
    private String pesel;
    private String specjalizacja;
    private Zmiana zmiana;
    private int wynagrodzenie;

    public LekarzFluentBuilder imie(String imie) {
        this.imie = imie;
        return this;
    }

    public LekarzFluentBuilder nazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return this;
    }

    public LekarzFluentBuilder pesel(String pesel) {
        this.pesel = pesel;
        return this;
    }

    public LekarzFluentBuilder specjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
        return this;
    }

    public LekarzFluentBuilder zmiana(Zmiana zmiana) {
        this.zmiana = zmiana;
        return this;
    }

    public LekarzFluentBuilder wynagrodzenie(int wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
        return this;
    }

    public Lekarz lekarzFluentBuild() {
        Lekarz lekarz = new Lekarz();
        lekarz.setImie(this.imie);
        lekarz.setNazwisko(this.nazwisko);
        lekarz.setPesel(this.pesel);
        lekarz.setSpecjalizacja(this.specjalizacja);
        lekarz.setZmiana(this.zmiana);
        lekarz.setWynagrodzenie(this.wynagrodzenie);
        return lekarz;
    }
}
