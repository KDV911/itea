package lesson12.builder;

public class Run {

    public static void main(String[] args) {
        Person iAm = new Person.Builder()
                .withName("Dmytro")
                .withColorHair("K")
                .build();

    }
}
