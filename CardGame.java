import java.util.ArrayList;

public class CardGame {
    String name;

    private ArrayList<Card> deckOfCards = new ArrayList<>();

    public CardGame(String name) {
        this.name = name;
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    // Sorts the deck in number order (e.g. 2222333344445555 etc) and stores the new
    // shuffled deck back into the deckOfCards attribute.
    // Will need to sort by value as the only parameter and store it as a new list.
    public ArrayList<Card> sortDeckInNumberOrder() {
        return deckOfCards;
    }

    //  Sorts the deck into suits (2,3,4,5,6,7,8,9,10,J,Q,K,A of hearts,
    //  then 2,3,4,5,6,7,8,9,10,J,Q,K,A of clubs etc) and stores the new shuffled
    //  deck back into the deckOfCards attribute.
    //  Similar to deckOfCards but will need to store new deck as a new list.
    public ArrayList<Card> sortDeckIntoSuits() {
        return deckOfCards;
    }

    //  Shuffles the deck into a random order and stores the new shuffled deck
    //  back into the deckOfCards attribute.
    //  Will need to store the new deck of cards as a new array list to be returned.
    public ArrayList<Card> shuffleDeck() {
        return deckOfCards;
    }

    public void printDeck() {
        for (Card card : deckOfCards) {
            System.out.println(card.toString());

        }
    }

    public void dealCard() {
            System.out.println(deckOfCards.get(0));
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
