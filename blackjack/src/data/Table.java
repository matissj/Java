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
public class Table {
    private Player player;
    private Dealer dealer;
    private Deck deck;

    public Table() {
       
    }
    
    
    
    public void startNewGame(){
        player = new Player();
        dealer = new Dealer();
        //1.izveido dalibnieku objektus
        //2.izveido karsu kavu
        deck = new Deck();
        //2.1 sajauc kartis
        deck.shuffle();
        //3.katram dalibniekam iedod 2 kartis
        player.giveCard(deck.takeCard());
        player.giveCard(deck.takeCard());
        dealer.giveCard(deck.takeCard());
        dealer.giveCard(deck.takeCard());
    }
    public void dealerTurn(){
        //1.kamēr dilerim ir nepieciešama vēl kārts, tikmēr ņem jaunu kārti no kāršu kavas un iedod dīlerim
        while(dealer.needOtherCard()){
            dealer.giveCard(deck.takeCard());
        }
    }
    
    public void givePlayerCard(){
        Card card = deck.takeCard();
        player.giveCard(card); // sis ir tas pats, kas || player.giveCard(deck.takeCard());
        //1.paņem kārti no kāršu kavas
        //2.iedod karti spēlētājam
    }
    
    public int getPlayerPoints(){
//atgriez speletaja punktus
        return player.countPoints();
    }
    
    public int getDealerPoints(){
        //1. atgriež dīlera punktus
        return dealer.countPoints();
    }
    
    public String getResult(){
        
        
        
        int dealer_points = getDealerPoints();
        int player_points = getPlayerPoints();
        //1. nosaka spletaja punktus
        //2.nosaka dilera punktus
        String pazinojums;
        if(player_points > 21 && dealer_points > 21){
            pazinojums = "Neizskirts";
            return pazinojums;
        }
        else if(player_points > 21){
            return "Tu zaudēji";
        }
        
        else if(dealer_points > 21){
            return "Tu uzvarēji";
        }
        else if(player_points > dealer_points){
            return "Tu uzvarēji";
        }
        else if(dealer_points > player_points){
            return "Tu zaudēji";
        }
        else if(dealer_points == player_points){
            return "neizskirts";
        }
        else {
            return "Tu zaudēji";
        }
        
        
        //3.atgriez tekstu ar pazinojumu, kursh uzvareja spēlē
    }
    
    public ArrayList<Card> getPlayerCards(){
        //1.atgriež spēlētāja kārtis
        return player.getCards();
    }
    
    public ArrayList<Card> getDealerCards(){
        //1.atgriez dīlera kāŗtis
        return   dealer.getCards();
    }
    
    
}

