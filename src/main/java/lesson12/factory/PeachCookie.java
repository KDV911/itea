package lesson12.factory;

public class PeachCookie implements Cookie{
    @Override
    public void eat() {
        System.out.println("\u001B[33m");
        System.out.println("This is peach cookie");
    }
}
