package BlackJack;

import java.util.ArrayList;

import BlackJackBase.PCard;
import BlackJackBase.PHand;

public class BJHand implements PHand{

    private ArrayList<BJCard> hands;

    public BJHand() {
        hands = new ArrayList<BJCard>();
    }

    @Override
    public int getSize() {
        return hands.size();
    }

    @Override
    public void addCard(PCard card) {
        if(card == null) {

        }else {
            hands.add((BJCard)card);
        }
    }

    @Override
    public PCard getCard(int index) {
        BJCard card = hands.get(index);
        return (PCard)card;
    }

    @Override
    public PCard removeCard(int index) {
        if (index >= 0 && index < hands.size()) {
            return hands.remove(index);
        }else {
            return null;
        }

    }

    @Override
    public int getValue() {
        int totalNum = 0;
        int totalAce = 0;
        for (BJCard c: hands) {
            int num =0;
            switch(c.getRank()) {
                case 1:
                    totalAce += 1;
                    num = 11;
                    break;
                case 11:
                    num = 10;
                    break;
                case 12:
                    num = 10;
                    break;
                case 13:
                    num = 10;
                    break;
                case 14:
                    num = 10;
                    break;
                default:
                    num = c.getRank();
                    break;
            }
            totalNum += num;
        }

        for(int i = 0 ; i < totalAce ; i++) {
            if(totalNum > 21 ) {
                totalNum -= 10;
            }
        }
        return totalNum;
    }

}