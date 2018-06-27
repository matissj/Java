/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd1_3uzd;

/**
 *
 * @author Matiss-Study
 */
public class DzimsanasDatums {
    int diena;
    int menesis;
    int gads;

    public DzimsanasDatums(int diena, int menesis, int gads) {
        this.diena = diena;
        this.menesis = menesis;
        this.gads = gads;
    }


    
    
    @Override
    public String toString() {
        return diena + " / " +  menesis + " / " + gads;
    }
    
  
}
