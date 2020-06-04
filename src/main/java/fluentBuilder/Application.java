package fluentBuilder;

public class Application {

    public static void main(String[] args) {
        Lekarz lekarz = new LekarzFluentBuilder()
                .imie("Szymon")
                .nazwisko("Nowak")
                .pesel("78987876632")
                .specjalizacja("Hirurg naczyniowy")
                .wynagrodzenie(200)
                .zmiana(Lekarz.Zmiana.NOCNA)
                .lekarzFluentBuild();
    }
}
