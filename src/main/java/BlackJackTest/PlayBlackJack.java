package BlackJackTest;

import java.awt.Color;
import BlackJack.BJHand;
import BlackJack.BJDeck;
import BlackJackBase.PGame;

public class PlayBlackJack {

    public static void main(String[] args) {

        PGame.setBackgroundColor(new Color(0, 100, 0));
        PGame.setBannerColor(new Color(105, 105, 105));
        PGame.setBannerTextColor(new Color(255, 255, 0));
        PGame.setStatusTextColor(new Color(255, 0, 0));
        PGame.setButtonColor(new Color(0, 128, 128));
        PGame.setButtonHighlightColor(new Color(0, 255, 255));
        PGame.setButtonTextColor(new Color(0, 0, 0));
        PGame.setFont("Serif");

        BJDeck deck = new BJDeck();
        BJHand dealer = new BJHand();
        BJHand player = new BJHand();


        PGame.run(deck, dealer, player);
    }
}


