package fluentBuilder;

public class Lekarz {
    public enum Zmiana {PORANNA, POPOŁUDNIOWA, NOCNA}

    private String imie;
    private String nazwisko;
    private String pesel;
    private String specjalizacja;
    private Zmiana zmiana;
    private int wynagrodzenie;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public Zmiana getZmiana() {
        return zmiana;
    }

    public int getWynagrodzenie() {
        return wynagrodzenie;
    }

    public static final class LekarzFluentBuilder {

        private String imie;
        private String nazwisko;
        private String pesel;
        private String specjalizacja;
        private Zmiana zmiana;
        private int wynagrodzenie;

        public LekarzFluentBuilder(String imie, String nazwisko) {
            this.imie = imie;
            this.nazwisko = nazwisko;
        }

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
            lekarz.imie = this.imie;
            lekarz.nazwisko = this.nazwisko;
            lekarz.pesel = this.pesel;
            lekarz.specjalizacja = this.specjalizacja;
            lekarz.zmiana = this.zmiana;
            lekarz.wynagrodzenie = this.wynagrodzenie;
            return lekarz;
        }
    }
}
