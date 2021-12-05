package lesson12.singelton;

public class Run {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Dmytro");
        Singleton singletonIvan = Singleton.getInstance("Ivan");

        System.out.println(singleton.name);
        System.out.println(singletonIvan.name);
    }
}
