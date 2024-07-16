package BlackJack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BJCardTest {

    @Test
    void testGetRank() {

        BJCard bjCard = new BJCard(BJCard.ACE, BJCard.SPADE);
        assertEquals(BJCard.ACE, bjCard.getRank());

    }//end of testGetRank()

    @Test
    void testSetRank() {

        BJCard bjCard = new BJCard(BJCard.ACE, BJCard.SPADE);
        bjCard.setRank(BJCard.JACK);
        assertEquals(bjCard.getRank(), BJCard.JACK);

    }//end of testSetRank

    @Test
    void testGetSuit() {

        BJCard bjCard = new BJCard(BJCard.ACE, BJCard.SPADE);
        assertEquals(BJCard.SPADE, bjCard.getSuit());

    }//end of testGetSuit()

    @Test
    void testSetSuit() {

        BJCard bjCard = new BJCard(BJCard.ACE, BJCard.SPADE);
        bjCard.setSuit(BJCard.HEART);
        assertEquals(bjCard.getSuit(), BJCard.HEART);

    }//end of testSetSuit()


    @Test
    void testHideCard() {

        BJCard bjCard = new BJCard(BJCard.ACE, BJCard.SPADE);
        bjCard.hideCard();
        assertTrue(bjCard.hidden);


    }//end of testHideCard()

    @Test
    void testShowCard() {

        BJCard bjCard = new BJCard(BJCard.ACE, BJCard.SPADE);
        bjCard.hidden = true;
        bjCard.showCard();
        assertFalse(bjCard.hidden);

    }//end of testShowCard()

    @Test
    void testIsHidden() {

        BJCard bjCard = new BJCard(BJCard.ACE, BJCard.SPADE);
        bjCard.hideCard();
        assertTrue(bjCard.hidden);

    }//end of testIsHidden()

    @Test
    void testGetText() {

        BJCard bjCard = new BJCard(BJCard.ACE, BJCard.SPADE);
        assertEquals(bjCard.getText(), "A\u2660");

    }//end of testGetText()



}//end of BJCardTest