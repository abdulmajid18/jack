package org.rozz;

public class Card {
    private String name;
    private Suit suit;
    private int faceValue;


    public Card(String name, Suit suit, int faceValue) {
        this.name = name;
        this.suit = suit;
        this.faceValue = faceValue;
    }
}
