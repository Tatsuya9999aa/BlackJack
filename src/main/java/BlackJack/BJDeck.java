package BlackJack;

import BlackJackBase.PCard;
import BlackJackBase.PDeck;

import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;


public class BJDeck implements PDeck {

    //Attributes
    public static ArrayList<BJCard> cards = new ArrayList<>();


    //Constructor
    public BJDeck() {

        //Clubs
        BJDeck.cards.add(0, new BJCard(BJCard.ACE, BJCard.CLUB));
        BJDeck.cards.add(1, new BJCard(BJCard.TWO, BJCard.CLUB));
        BJDeck.cards.add(2, new BJCard(BJCard.THREE, BJCard.CLUB));
        BJDeck.cards.add(3, new BJCard(BJCard.FOUR, BJCard.CLUB));
        BJDeck.cards.add(4, new BJCard(BJCard.FIVE, BJCard.CLUB));
        BJDeck.cards.add(5, new BJCard(BJCard.SIX, BJCard.CLUB));
        BJDeck.cards.add(6, new BJCard(BJCard.SEVEN, BJCard.CLUB));
        BJDeck.cards.add(7, new BJCard(BJCard.EIGHT, BJCard.CLUB));
        BJDeck.cards.add(8, new BJCard(BJCard.NINE, BJCard.CLUB));
        BJDeck.cards.add(9, new BJCard(BJCard.TEN, BJCard.CLUB));
        BJDeck.cards.add(10, new BJCard(BJCard.JACK, BJCard.CLUB));
        BJDeck.cards.add(11, new BJCard(BJCard.KNIGHT, BJCard.CLUB));
        BJDeck.cards.add(12, new BJCard(BJCard.QUEEN, BJCard.CLUB));
        BJDeck.cards.add(13, new BJCard(BJCard.KING, BJCard.CLUB));

        //Spades
        BJDeck.cards.add(14, new BJCard(BJCard.ACE, BJCard.SPADE));
        BJDeck.cards.add(15, new BJCard(BJCard.TWO, BJCard.SPADE));
        BJDeck.cards.add(16, new BJCard(BJCard.THREE, BJCard.SPADE));
        BJDeck.cards.add(17, new BJCard(BJCard.FOUR, BJCard.SPADE));
        BJDeck.cards.add(18, new BJCard(BJCard.FIVE, BJCard.SPADE));
        BJDeck.cards.add(19, new BJCard(BJCard.SIX, BJCard.SPADE));
        BJDeck.cards.add(20, new BJCard(BJCard.SEVEN, BJCard.SPADE));
        BJDeck.cards.add(21, new BJCard(BJCard.EIGHT, BJCard.SPADE));
        BJDeck.cards.add(22, new BJCard(BJCard.NINE, BJCard.SPADE));
        BJDeck.cards.add(23, new BJCard(BJCard.TEN, BJCard.SPADE));
        BJDeck.cards.add(24, new BJCard(BJCard.JACK, BJCard.SPADE));
        BJDeck.cards.add(25, new BJCard(BJCard.KNIGHT, BJCard.SPADE));
        BJDeck.cards.add(26, new BJCard(BJCard.QUEEN, BJCard.SPADE));
        BJDeck.cards.add(27, new BJCard(BJCard.KING, BJCard.SPADE));

        //Hearts
        BJDeck.cards.add(28, new BJCard(BJCard.ACE, BJCard.HEART));
        BJDeck.cards.add(29, new BJCard(BJCard.TWO, BJCard.HEART));
        BJDeck.cards.add(30, new BJCard(BJCard.THREE, BJCard.HEART));
        BJDeck.cards.add(31, new BJCard(BJCard.FOUR, BJCard.HEART));
        BJDeck.cards.add(32, new BJCard(BJCard.FIVE, BJCard.HEART));
        BJDeck.cards.add(33, new BJCard(BJCard.SIX, BJCard.HEART));
        BJDeck.cards.add(34, new BJCard(BJCard.SEVEN, BJCard.HEART));
        BJDeck.cards.add(35, new BJCard(BJCard.EIGHT, BJCard.HEART));
        BJDeck.cards.add(36, new BJCard(BJCard.NINE, BJCard.HEART));
        BJDeck.cards.add(37, new BJCard(BJCard.TEN, BJCard.HEART));
        BJDeck.cards.add(38, new BJCard(BJCard.JACK, BJCard.HEART));
        BJDeck.cards.add(39, new BJCard(BJCard.KNIGHT, BJCard.HEART));
        BJDeck.cards.add(40, new BJCard(BJCard.QUEEN, BJCard.HEART));
        BJDeck.cards.add(41, new BJCard(BJCard.KING, BJCard.HEART));

        //Diamonds
        BJDeck.cards.add(42, new BJCard(BJCard.ACE, BJCard.DIAMOND));
        BJDeck.cards.add(43, new BJCard(BJCard.TWO, BJCard.DIAMOND));
        BJDeck.cards.add(44, new BJCard(BJCard.THREE, BJCard.DIAMOND));
        BJDeck.cards.add(45, new BJCard(BJCard.FOUR, BJCard.DIAMOND));
        BJDeck.cards.add(46, new BJCard(BJCard.FIVE, BJCard.DIAMOND));
        BJDeck.cards.add(47, new BJCard(BJCard.SIX, BJCard.DIAMOND));
        BJDeck.cards.add(48, new BJCard(BJCard.SEVEN, BJCard.DIAMOND));
        BJDeck.cards.add(49, new BJCard(BJCard.EIGHT, BJCard.DIAMOND));
        BJDeck.cards.add(50, new BJCard(BJCard.NINE, BJCard.DIAMOND));
        BJDeck.cards.add(51, new BJCard(BJCard.TEN, BJCard.DIAMOND));
        BJDeck.cards.add(52, new BJCard(BJCard.JACK, BJCard.DIAMOND));
        BJDeck.cards.add(53, new BJCard(BJCard.KNIGHT, BJCard.DIAMOND));
        BJDeck.cards.add(54, new BJCard(BJCard.QUEEN, BJCard.DIAMOND));
        BJDeck.cards.add(55, new BJCard(BJCard.KING, BJCard.DIAMOND));

    }//end of constructor BJDeck()

    //Abstract methods

    @Override
    public void shuffle() {/** Randomizes the deck. */

        Collections.shuffle(cards);
        System.out.println(cards);

    }//end of shuffle()

    @Override
    public void addCard(PCard card) { /** Adds a card to the end of the deck. */

        BJDeck.cards.add((BJCard) card);

    }//end of addCard(PCard)

    @Override
    public PCard dealCard() {
        /** Removes a card from the end of the deck. Returns Null if the deck is empty.*/

        if (!cards.isEmpty()) {
//         TODO あとでやる
            return cards.remove(cards.size() - 1);

        } else {

            return null;

        }//end of else

    }//end of dealCard()

    @Override
    public PCard dealHiddenCard() { /** Removes a card from the end of the deck and marks it as hidden. Returns Null if the deck is empty.*/

        if (!cards.isEmpty()) {
//         TODO　あとでやる

            PCard card = cards.remove(cards.size() - 1);
            card.hideCard();
            return card;

        } else {

            return null;

        }//end of else

    }//end of dealHiddenCard()

    @Override
    public int cardCount() { /** Returns the number of cards in the deck. */

        return cards.size();

    }//end of cardCount()

}

