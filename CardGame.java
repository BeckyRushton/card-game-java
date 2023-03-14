import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {
    String name;

    private ArrayList<Card> deckOfCards = new ArrayList<>();

    public ArrayList<Card> dealtCards = new ArrayList<>();

    public CardGame(String name) {
        this.name = name;
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }



    public ArrayList<Card> sortDeckInNumberOrder() {
        deckOfCards.sort(Comparator.comparing(Card::getValue));
        {
            System.out.println("You have sorted the deck in number order. See below for the new deck order... ");
        }
        return null;
    }


    public ArrayList<Card> sortDeckIntoSuits() {
        deckOfCards.sort(Comparator.comparing(Card::getSuit));
        {
            System.out.println("You have sorted the deck in suits. See below for the new deck order... ");
        }
        return null;
    }


    public ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        {
            System.out.println("You have shuffled the deck. See below for the new deck order... ");
        }
        return null;
    }


    public void printDeck() {
        for (Card card : deckOfCards) {
            System.out.println(card.toString());

        }

    }

    public Card dealCard() {
        Card topCard = getDeckOfCards().get(0);
        getDeckOfCards().remove(0);
        dealtCards.add(topCard);
        return topCard;

    }

    {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < CardUtils.value.length; j++) {
                Card card = new Card(CardUtils.suits[i], CardUtils.symbol[j], CardUtils.value[j]);
                deckOfCards.add(card);
            }
        }
    }
}

