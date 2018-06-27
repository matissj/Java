/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Matiss-Study
 */
public class Deck {
    private ArrayList<Card> cards;
    
    private String[] values = {"2","3","4","5","6","7","8","9","10","J","Q","K","A",};
    private char[] suits = {'H','S','C','D'};

public Deck(){

this.cards = new ArrayList();

    for(char suit : this.suits){ //iet cauri visiem mastiem
        for(String value : this.values){ //iet cauri visam vertibam
            this.cards.add(new Card(suit,value));
}
}
}

public void shuffle() {
    Collections.shuffle(this.cards); //sajauc kartis
}

public Card takeCard(){
    Card lastCard = cards.get(cards.size() - 1);
    cards.remove(lastCard);
    
    return lastCard;
}
}

//1 konstruktors kas izveido sarakstu , izveido jaunu karsu kavu ar kartim
//3.sajauc karsu kavu
//4.panemt vienu karti, dzesh no saraksta un atgriez