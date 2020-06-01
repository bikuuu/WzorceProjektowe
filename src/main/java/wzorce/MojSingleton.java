package wzorce;

public class MojSingleton {
    private static MojSingleton instance;

    private MojSingleton() {
        instance = new MojSingleton();
    }

    public static MojSingleton getMojSingleton() {
        if (instance == null) {
            instance = new MojSingleton();
        }
        return instance;
    }

    public void metodaSingletona() {
        System.out.println("Jestem metoda singletowa");
    }
}

