package lesson12.singelton;

public final class Singleton {

    private static Singleton instance;
    public String name;

    private Singleton(String name) {
        System.out.printf("TRY");
        this.name = name;
    }

    public static Singleton getInstance(String name) {
        if (instance == null)
            instance = new Singleton(name);
        return instance;
    }
}
