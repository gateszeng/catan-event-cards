package com.example.gates.catancards;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by gates on 7/29/2016.
 */
public class Deck {

    // Constants
    private static final int DECKSIZE   = 36;
    private static final int NUM2OR12   = 1;
    private static final int NUM3OR11   = 2;
    private static final int NUM4OR10   = 3;
    private static final int NUM5OR9    = 4;
    private static final int NUM6OR8    = 5;
    private static final int NUM7       = 6;
    private static final int NORMAL     = 0;
    private static final int CALM       = 1;
    private static final int NEIGHBORLY = 2;
    private static final int EPIDEMIC   = 3;
    private static final int EARTHQUAKE = 4;
    private static final int GOOD       = 5;
    private static final int TRADE      = 6;
    private static final int TOURNAMENT = 7;
    private static final int CONFLICT   = 8;
    private static final int PLENTIFUL  = 9;
    private static final int ROBBERATCK = 10;
    private static final int ROBBERFLEE = 11;
    private static final int NEWYEAR    = 12;
    private static final int MAX_CARD_COUNT = 31;

    // Instance variables
    private ArrayList<Card> eventCards = new ArrayList<>();
    private Random rand = new Random();
    private int counter = 0;

    /*
     * Deck()
     *
     * Constructor that creates a new deck;
     */
    public Deck() {
        createDeck();
    }

    /*
     * createDeck()
     *
     * Creates the deck of Catan Cards
     */
    public void createDeck() {
        eventCards.add(new Card(2, PLENTIFUL));
        eventCards.add(new Card(3, CONFLICT));
        eventCards.add(new Card(3, NORMAL));
        eventCards.add(new Card(4, ROBBERFLEE));
        eventCards.add(new Card(4, ROBBERFLEE));
        eventCards.add(new Card(4, NORMAL));
        eventCards.add(new Card(5, TRADE));
        eventCards.add(new Card(5, TOURNAMENT));
        eventCards.add(new Card(5, NORMAL));
        eventCards.add(new Card(5, NORMAL));
        eventCards.add(new Card(6, EPIDEMIC));
        eventCards.add(new Card(6, EARTHQUAKE));
        eventCards.add(new Card(6, GOOD));
        eventCards.add(new Card(6, NORMAL));
        eventCards.add(new Card(6, NORMAL));
        eventCards.add(new Card(7, ROBBERATCK));
        eventCards.add(new Card(7, ROBBERATCK));
        eventCards.add(new Card(7, ROBBERATCK));
        eventCards.add(new Card(7, ROBBERATCK));
        eventCards.add(new Card(7, ROBBERATCK));
        eventCards.add(new Card(7, ROBBERATCK));
        eventCards.add(new Card(8, EPIDEMIC));
        eventCards.add(new Card(8, NORMAL));
        eventCards.add(new Card(8, NORMAL));
        eventCards.add(new Card(8, NORMAL));
        eventCards.add(new Card(8, NORMAL));
        eventCards.add(new Card(9, CALM));
        eventCards.add(new Card(9, NORMAL));
        eventCards.add(new Card(9, NORMAL));
        eventCards.add(new Card(9, NORMAL));
        eventCards.add(new Card(10, NEIGHBORLY));
        eventCards.add(new Card(10, NORMAL));
        eventCards.add(new Card(10, NORMAL));
        eventCards.add(new Card(11, NEIGHBORLY));
        eventCards.add(new Card(11, NORMAL));
        eventCards.add(new Card(12, CALM));
        shuffle();
    }

    /**
     * public void clearDeck()
     *
     * clears the deck completely
     */
    public void clearDeck() {
        eventCards.clear();
        counter = 0;
    }

    /**
     * public void shuffle()
     *
     * shuffles the deck
     * }
     */
    public void shuffle() {
        // goes through each card and finds a random location to put the card
        for (int i = 0; i < eventCards.size(); i++) {
            Card currCard = eventCards.get(i);
            int randIndex = rand.nextInt(eventCards.size());
            eventCards.remove(i);
            eventCards.add(randIndex, currCard);
        }

    }

    /**
     * nextCard()
     *
     * draws the next card
     */
    public Card nextCard() {
        if (counter > MAX_CARD_COUNT) {
            clearDeck();
            createDeck();
            return new Card(0, NEWYEAR);
        }
        return eventCards.get(++counter);
    }

    /*
     * prevCard()
     *
     * Draws the previous card
     */

    public Card prevCard() {
        if (--counter > 0) {
            return eventCards.get(counter);
        }
        counter = 1;
        return eventCards.get(1);
    }



    public int getCount() {
        return counter;
    }
}
