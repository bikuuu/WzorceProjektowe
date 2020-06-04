package fluentBuilder;

public class Application {

    public static void main(String[] args) {
        Lekarz lekarz = new Lekarz.LekarzFluentBuilder("Szymon", "Nowak")
                .pesel("78987876632")
                .specjalizacja("Hirurg naczyniowy")
                .wynagrodzenie(200)
                .zmiana(Lekarz.Zmiana.NOCNA)
                .lekarzFluentBuild();
    }
}
