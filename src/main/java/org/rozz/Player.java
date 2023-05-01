package org.rozz;

import java.util.ArrayList;

public class Player extends BasePlayer{
    private Bet bet;

    public Player(Bet bet) {
        this.hands = new ArrayList<>();
        this.bet = bet;

    }
}
