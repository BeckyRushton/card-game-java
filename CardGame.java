import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class CardGame {
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
        return null;
    }


    public ArrayList<Card> sortDeckIntoSuits() {
        deckOfCards.sort(Comparator.comparing(Card::getSuit));
        return null;
    }


    public ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        return null;
    }


    public void printDeck() {
        for (Card card : deckOfCards) {
            System.out.println(card.toString());

        }

    }

    public void printDeal() {

            System.out.println(dealCard());

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

