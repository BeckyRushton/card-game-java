import java.util.Objects;
import java.util.Scanner;

public class Snap extends CardGame {
    private Card currentCard = null;
    private Card previousCard = null;

    private boolean isPlaying = true;

    public Snap(String name) {
        super(name);
    }


    public void startGame() {
        System.out.println("Welcome to Snap!");
        System.out.println("If you get two cards of the same type such as two Jacks or two 3's, you've won!");
        System.out.println("Press enter to begin.");
        Scanner scanner = new Scanner(System.in);
        String newGame = scanner.nextLine();
        if (Objects.equals(newGame, "")) {
            System.out.println("The first card is...");
        }

    }

    @Override
    public Card dealCard() {
        if (currentCard != null) {
            previousCard = currentCard;
        }
        currentCard = getDeckOfCards().get(0);
        getDeckOfCards().remove(0);
        return currentCard;
    }

    @Override
    public void printDeal() {
        if (!(previousCard == null)) {
            System.out.println(previousCard);
            System.out.println(currentCard);
        } else {
            System.out.println(currentCard);
        }


    }

    public void compareCards(Card cardOne, Card cardTwo) {

        if (cardOne.getValue() == cardTwo.getValue()) {
            System.out.println("Snap! You won!");
            isPlaying = false;
            System.exit(0);
        }
    }

    public void snapRound() {
        shuffleDeck();
        dealCard();
        printDeal();
        Scanner scanner = new Scanner(System.in);
        String newCard = scanner.nextLine();


        while (isPlaying) {
            System.out.println(newCard);
            shuffleDeck();
            dealCard();
            printDeal();
            compareCards(currentCard, previousCard);
            System.out.println("Press enter to deal another card...");
            newCard = scanner.nextLine();

        }
    }
}




