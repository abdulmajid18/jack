package org.rozz;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private int value;
    private ArrayList<Card> cards;

    public Hand(BlackjackCard c1, BlackjackCard c2) {
        this.cards = new ArrayList<>();
        this.cards.add(c1);
        this.cards.add(c2);
    }
}
