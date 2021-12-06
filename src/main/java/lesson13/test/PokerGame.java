package lesson13.test;

public class PokerGame {
    public static void main(String[] args) throws NullPointerException{

        PokerMachine pokerMachine = new PokerMachine();

        Card[] deck= null;
        try {
            pokerMachine.shuffleDeck(deck);
        } catch (NullPointerException e) {
            throw new NullPointerException(e.getMessage());
        }
        pokerMachine.serveCards(deck);
    }
}
