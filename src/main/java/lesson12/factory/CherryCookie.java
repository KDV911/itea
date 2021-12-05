package lesson12.factory;

public class CherryCookie implements Cookie{
    @Override
    public void eat() {
        System.out.println("\u001B[31m");
        System.out.println("This is cherry cookie");
    }
}
