/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Matiss-Study
 */
public class Player {
    private ArrayList<Card> cards;
    
    // 1.konstruktoru, kas izveido tuksu sarakstu
    //3. metode, kas nosaka, vai speletajam vajag vel karti
    //4.metode, kas saskaita punktus speletajam
    
    public Player(){
        this.cards = new ArrayList();
    }
    //2. metode kas iedod karti speletajam
    public void giveCard(Card card){
        cards.add(card);
    }
    
    public boolean needOtherCard(){
        return countPoints() <= 21;
    }
    
//4.metode, kas saskaita punktus speletajam
//4.1 jasaskaita max iespejamie speletaja punkti - pienemot ka duzis ir 11
//4.2 ja punktu skaits parsniedz 21 un ir kads duzis, tad punktu skaitu samazina par 10 un atgrizas pie punkta 4.2
    public int countPoints(){
        int totalPoints = 0;
        int aceCount = 0;
        
        for(Card card : cards){
            int value = card.getValue();
            totalPoints = totalPoints + value;
            if(value == 11){
                aceCount++;
            }
            
        while(totalPoints > 21 && aceCount > 0){
            totalPoints = totalPoints - 10;
            aceCount--;
        }
                
        }
        return totalPoints;
    }
    public ArrayList<Card> getCards(){
        return this.cards;
    }
}