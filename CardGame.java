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

    public void printDeck() {
        for (Card card : deckOfCards) {
            System.out.println(card.toString());

        }
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
