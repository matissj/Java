/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Matiss-Study
 */
public class Card {
    
    private char suit;
    
    private String value;

    public Card(char suit, String value) {
        this.suit = suit;
        this.value = value;
    }
    
    public String GetName(){
        String name = (suit + " " + value);
        return name;
    }
    
    public int getValue(){
        int vertiba;
        switch(value){
            case "A": return 11;
            case "J":
            case "Q":
            case "K": return 10;

            default: return Integer.valueOf(this.value);
            
        }
        
    }
    //1. kontruktors ar 2 parametriem
    //2. metode, kas atgriez pilnu karts nosaukumu
    //3.metode,kas atgriez karts skaitlisko vertibu
}
