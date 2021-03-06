package io.zipcoder.casino;

import java.util.ArrayList;

public class GoFishPlayer extends Player<GoFishPlayer> implements Comparable<GoFishPlayer> {

    @Override
    public String getName() {
        return name;
    }

    public String name;
   private ArrayList<Card> cardsInHand;

    GoFishPlayer (String name) {
        this.name = name;
        this.cardsInHand = new ArrayList<>();
    }


    public void dealGoFishHand(ArrayList<GoFishPlayer> players, Deck deck) {
        for (int i = 1; i <= 5; i++) {
            for (GoFishPlayer player : players)
                player.cardsInHand.add(deck.dealOneRandomCard());
        }
    }

    public void addCardToHand(Card newCard) {
        cardsInHand.add(newCard);
    }

    public ArrayList<Card> getHandList() {
        return cardsInHand;
    }

    public String viewHand() {
        String handString = "";
        for (Card card : cardsInHand) {
            handString += card.getCardsValue();
        }
        return handString;
    }

    public void goFish(Card card){
        addCardToHand(card);
    }


    //    public Double bet(Double bet) {
//        return null;
//    }
    //Stubbed this method out b/c may be needed in console/actual game-play integration... delete it if not...
    @Override
    public int compareTo(GoFishPlayer o) {
        return 0;
    }
}


