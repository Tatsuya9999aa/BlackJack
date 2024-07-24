package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import BlackJackBase.PCard;
import BlackJackBase.PDeck;

public class BJDeck implements PDeck {

    private ArrayList<PCard> deck;

    public BJDeck() {
        deck = new ArrayList<>();
        // デッキにカードを追加する (52枚のカードを生成してデッキに追加する)
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                deck.add(new BJCard(rank, suit));
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(deck);
    }

    @Override
    public void addCard(PCard card) {
        if (card != null) {
            deck.add(card);
        }
    }

    @Override
    public PCard dealCard() {
        if (!deck.isEmpty()) {
            return deck.remove(deck.size() - 1);
        } else {
            return null;
        }
    }

    @Override
    public PCard dealHiddenCard() {
        if (!deck.isEmpty()) {
            PCard card = deck.remove(deck.size() - 1);
            card.hideCard();
            return card;
        } else {
            return null;
        }
    }

    @Override
    public int cardCount() {
        return deck.size();
    }
}


