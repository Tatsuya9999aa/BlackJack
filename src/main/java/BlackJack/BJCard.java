package BlackJack;

import BlackJackBase.PCard;
import java.awt.Color;

public class BJCard extends PCard {



    //Attributes
    int rank;
    int suit;
    boolean hidden;


    public static final int ACE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int JACK = 11;
    public static final int KNIGHT = 12;
    public static final int QUEEN = 13;
    public static final int KING = 14;

    //Constructors for suit
    public static final int SPADE = 1;
    public static final int HEART = 2;
    public static final int DIAMOND = 3;
    public static final int CLUB = 4;

    //Constructors with two int arguments
    public BJCard(int rank, int suit){

        this.rank = rank;
        this.suit = suit;
        hidden = false;

    }//end of constructor(int, int)

    //Getter and setter methods
    public int getRank() {

        return rank;

    }//end of getRank()

    public void setRank(int newRank) {

        rank = newRank;

    }//end of setRank(int)

    public int getSuit() {

        return suit;

    }//end of getSuit()

    public void setSuit(int newSuit) {

        suit = newSuit;

    }//end of setSuit(int)

    //Override abstract methods
    @Override
    public void hideCard() {

        hidden = true;

    }//end of hideCard()

    @Override
    public void showCard() {

        hidden = false;

    }//end of showCard()

    @Override
    public boolean isHidden() {

        return hidden;

    }//end of isHidden()

    @Override
    public String getText() {

        String cardText = "";

        if(rank == ACE) {
            cardText = "A";
        } else if(rank == TWO) {
            cardText = "2";
        } else if(rank == THREE) {
            cardText = "3";
        } else if(rank == FOUR) {
            cardText = "4";
        } else if(rank == FIVE) {
            cardText = "5";
        } else if(rank == SIX) {
            cardText = "6";
        } else if(rank == SEVEN) {
            cardText = "7";
        } else if(rank == EIGHT) {
            cardText = "8";
        } else if(rank == NINE) {
            cardText = "9";
        } else if(rank == TEN) {
            cardText = "10";
        }else if(rank == JACK) {
            cardText = "J";
        }else if(rank == KNIGHT) {
            cardText = "Kn";
        }else if(rank == QUEEN) {
            cardText = "Q";
        }else if(rank == KING) {
            cardText = "K";
        }//end of else if

        if(suit == SPADE) {
            cardText += "\u2660";
        }else if(suit == HEART) {
            cardText += "\u2665";
        }else if(suit == DIAMOND) {
            cardText += "\u2666";
        }else if(suit == CLUB) {
            cardText += "\u2663";
        }//end of else if

        return cardText;

    }//end of getText()

    @Override
    public Color getFontColor() {

        if(suit == HEART || suit == DIAMOND) {
            return Color.RED;
        } else {
            return Color.BLACK;
        }

    }


}
