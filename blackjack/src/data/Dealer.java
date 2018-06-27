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
public class Dealer extends Player { // Dealer manto speletaja klasi.
    
    public Dealer(){
        
    }
    @Override
    public boolean needOtherCard(){
            return this.countPoints() < 17;
    }
}

