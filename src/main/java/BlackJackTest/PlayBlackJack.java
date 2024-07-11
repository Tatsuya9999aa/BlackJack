package BlackJackTest;

import BlackJack.BJCard;
import BlackJackBase.PCard;

public class PlayBlackJack {

    public static void main(String[] args) {

        PCard aceSpade = new BJCard(BJCard.ACE, BJCard.SPADE);

        CardTest.run(aceSpade);

        PCard sixHeart = new BJCard(BJCard.SIX, BJCard.HEART);

        CardTest.run(sixHeart);

        PCard jackSpade = new BJCard(BJCard.JACK, BJCard.SPADE);

        CardTest.run(jackSpade);

        PCard knightHeart = new BJCard(BJCard.KNIGHT, BJCard.HEART);

        CardTest.run(knightHeart);

        PCard queenDiamond = new BJCard(BJCard.QUEEN, BJCard.DIAMOND);

        CardTest.run(queenDiamond);

        PCard kingClub = new BJCard(BJCard.KING, BJCard.CLUB);

        CardTest.run(kingClub);



    }

}

