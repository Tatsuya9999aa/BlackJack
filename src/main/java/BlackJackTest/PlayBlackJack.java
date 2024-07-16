package BlackJackTest;

import BlackJack.BJDeck;
import BlackJack.BJHand;

public class PlayBlackJack {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//  BJCard card0 = new BJCard(BJCard.ACE,BJCard.SPADE);
//  BJCard card1 = new BJCard(BJCard.SIX,BJCard.HEART);
//  BJCard card2= new BJCard(BJCard.JACK,BJCard.SPADE);
//  BJCard card3 = new BJCard(BJCard.KNIGHT,BJCard.HEART);
//  BJCard card4 = new BJCard(BJCard.QUEEN,BJCard.DIAMOND);
//  BJCard card5 = new BJCard(BJCard.KING,BJCard.CLUB);
//
//
//        // Pass the PCard object to the run() method
//        CardTest.run(card0);
//        CardTest.run(card1);
//        CardTest.run(card2);
//        CardTest.run(card3);
//        CardTest.run(card4);
//        CardTest.run(card5);

        BJDeck deck = new BJDeck();
        BJHand hand = new BJHand();
//  DeckTest.run(deck);
        HandTest.run(deck, hand);

//  PGame.setBackgroundColor(Color.GREEN);
//  PGame.setBannerColor(Color.DARK_GRAY);
//  PGame.setBannerTextColor(Color.white);
//  PGame.setStatusTextColor(Color.BLACK);
//  PGame.setButtonColor(Color.LIGHT_GRAY);
//  PGame.setButtonTextColor(Color.BLACK);
//  PGame.setButtonHighlightColor(Color.orange);
//  PGame.setFont("Helvetica");
//  BJDeck deck = new BJDeck();
//  BJHand dealer = new BJHand();
//  BJHand player = new BJHand();
//  PGame.run(deck, player, dealer);
//
    }


}

