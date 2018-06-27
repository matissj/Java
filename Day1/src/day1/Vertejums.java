/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author Matiss-Study
 */
public class Vertejums {
    MacibuPrieksmets prieksmets;
    Skolens skolens;
    int atzime;

    public Vertejums(MacibuPrieksmets prieksmets, Skolens skolens, int atzime) {
        this.prieksmets = prieksmets;
        this.skolens = skolens;
        this.atzime = atzime;
    }
    
    public String Informacija(){
        
        return "Skolēns : " + skolens.Vards + " " + skolens.Uzvards +", "+ "Klase: "+ skolens.klase.nosaukums +
                " , priekšmetā " +  prieksmets.nosaukums + " ieguvis vertejumu " +  atzime + " balles" + " , Pasniedzja: " + prieksmets.Pasniedzejs.Vards + " "+prieksmets.Pasniedzejs.Uzvards;
    }
    
    
    
    
}
