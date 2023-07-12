package com.neutrinosvs.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void canGetValueAtCard(){
        Card card = new Card(Suit.DIAMONDS,Rank.NINE);
        Assertions.assertEquals(0,card.getValues());
        Card card1 = new Card("hearts","queen");
        System.out.println(card1);

    }

}