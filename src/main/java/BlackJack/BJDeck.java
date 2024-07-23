package BlackJack;

import BlackJackBase.PCard;
import BlackJackBase.PDeck;

import java.util.Collections;
import java.util.ArrayList;

public class BJDeck implements PDeck {

    //Attributes
    private ArrayList<BJCard> cards;

    //Constructor
    public BJDeck() {
        cards = new ArrayList<>();

        //Clubs
        cards.add(new BJCard(BJCard.ACE, BJCard.CLUB));
        cards.add(new BJCard(BJCard.TWO, BJCard.CLUB));
        cards.add(new BJCard(BJCard.THREE, BJCard.CLUB));
        cards.add(new BJCard(BJCard.FOUR, BJCard.CLUB));
        cards.add(new BJCard(BJCard.FIVE, BJCard.CLUB));
        cards.add(new BJCard(BJCard.SIX, BJCard.CLUB));
        cards.add(new BJCard(BJCard.SEVEN, BJCard.CLUB));
        cards.add(new BJCard(BJCard.EIGHT, BJCard.CLUB));
        cards.add(new BJCard(BJCard.NINE, BJCard.CLUB));
        cards.add(new BJCard(BJCard.TEN, BJCard.CLUB));
        cards.add(new BJCard(BJCard.JACK, BJCard.CLUB));
        cards.add(new BJCard(BJCard.KNIGHT, BJCard.CLUB));
        cards.add(new BJCard(BJCard.QUEEN, BJCard.CLUB));
        cards.add(new BJCard(BJCard.KING, BJCard.CLUB));

        //Spades
        cards.add(new BJCard(BJCard.ACE, BJCard.SPADE));
        cards.add(new BJCard(BJCard.TWO, BJCard.SPADE));
        cards.add(new BJCard(BJCard.THREE, BJCard.SPADE));
        cards.add(new BJCard(BJCard.FOUR, BJCard.SPADE));
        cards.add(new BJCard(BJCard.FIVE, BJCard.SPADE));
        cards.add(new BJCard(BJCard.SIX, BJCard.SPADE));
        cards.add(new BJCard(BJCard.SEVEN, BJCard.SPADE));
        cards.add(new BJCard(BJCard.EIGHT, BJCard.SPADE));
        cards.add(new BJCard(BJCard.NINE, BJCard.SPADE));
        cards.add(new BJCard(BJCard.TEN, BJCard.SPADE));
        cards.add(new BJCard(BJCard.JACK, BJCard.SPADE));
        cards.add(new BJCard(BJCard.KNIGHT, BJCard.SPADE));
        cards.add(new BJCard(BJCard.QUEEN, BJCard.SPADE));
        cards.add(new BJCard(BJCard.KING, BJCard.SPADE));

        //Hearts
        cards.add(new BJCard(BJCard.ACE, BJCard.HEART));
        cards.add(new BJCard(BJCard.TWO, BJCard.HEART));
        cards.add(new BJCard(BJCard.THREE, BJCard.HEART));
        cards.add(new BJCard(BJCard.FOUR, BJCard.HEART));
        cards.add(new BJCard(BJCard.FIVE, BJCard.HEART));
        cards.add(new BJCard(BJCard.SIX, BJCard.HEART));
        cards.add(new BJCard(BJCard.SEVEN, BJCard.HEART));
        cards.add(new BJCard(BJCard.EIGHT, BJCard.HEART));
        cards.add(new BJCard(BJCard.NINE, BJCard.HEART));
        cards.add(new BJCard(BJCard.TEN, BJCard.HEART));
        cards.add(new BJCard(BJCard.JACK, BJCard.HEART));
        cards.add(new BJCard(BJCard.KNIGHT, BJCard.HEART));
        cards.add(new BJCard(BJCard.QUEEN, BJCard.HEART));
        cards.add(new BJCard(BJCard.KING, BJCard.HEART));

        //Diamonds
        cards.add(new BJCard(BJCard.ACE, BJCard.DIAMOND));
        cards.add(new BJCard(BJCard.TWO, BJCard.DIAMOND));
        cards.add(new BJCard(BJCard.THREE, BJCard.DIAMOND));
        cards.add(new BJCard(BJCard.FOUR, BJCard.DIAMOND));
        cards.add(new BJCard(BJCard.FIVE, BJCard.DIAMOND));
        cards.add(new BJCard(BJCard.SIX, BJCard.DIAMOND));
        cards.add(new BJCard(BJCard.SEVEN, BJCard.DIAMOND));
        cards.add(new BJCard(BJCard.EIGHT, BJCard.DIAMOND));
        cards.add(new BJCard(BJCard.NINE, BJCard.DIAMOND));
        cards.add(new BJCard(BJCard.TEN, BJCard.DIAMOND));
        cards.add(new BJCard(BJCard.JACK, BJCard.DIAMOND));
        cards.add(new BJCard(BJCard.KNIGHT, BJCard.DIAMOND));
        cards.add(new BJCard(BJCard.QUEEN, BJCard.DIAMOND));
        cards.add(new BJCard(BJCard.KING, BJCard.DIAMOND));
    }

    //Abstract methods
    @Override
    public void shuffle() {
        /** Randomizes the deck. */
        Collections.shuffle(cards);
        System.out.println(cards);
    }

    @Override
    public void addCard(PCard card) {
        /** Adds a card to the end of the deck. */
        cards.add((BJCard) card);
    }

    @Override
    public PCard dealCard() {
        /** Removes a card from the end of the deck. Returns Null if the deck is empty. */
        if (!cards.isEmpty()) {
            return cards.remove(cards.size() - 1);
        } else {
            return null;
        }
    }

    @Override
    public PCard dealHiddenCard() {
        /** Removes a card from the end of the deck and marks it as hidden. Returns Null if the deck is empty. */
        if (!cards.isEmpty()) {
            BJCard card = cards.remove(cards.size() - 1);
            card.hideCard();
            return card;
        } else {
            return null;
        }
    }

    @Override
    public int cardCount() {
        /** Returns the number of cards in the deck. */
        return cards.size();
    }
}

