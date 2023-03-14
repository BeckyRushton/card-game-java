public class Main {
    public static void main(String[] args) {
        CardGame cardGame = new CardGame("testing");
        cardGame.printDeck();
        cardGame.sortDeckInNumberOrder();
        cardGame.printDeck();
        cardGame.dealCard();
        cardGame.sortDeckIntoSuits();
        cardGame.printDeck();
        cardGame.dealCard();
        cardGame.shuffleDeck();
        cardGame.printDeck();
        cardGame.dealCard();



    }
}
