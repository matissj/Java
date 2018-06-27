/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author Matiss-Study
 */
public class KravasTransportlidzeklis extends Transportlidzeklis {
    double kravasIetilpiba;

    public KravasTransportlidzeklis(String razotajs, String marka, int gads, double kravasIetilpiba) {
        super(razotajs, marka, gads); // super izsauc konstruktoru no transportlidzekla
        /*
        this.razotajs = razotajs; super izpilda visas siis rindas
        this.marka = marka;
        this.gads = gads;
        */ 
        this.kravasIetilpiba = kravasIetilpiba;
    }
            
         @Override
         public String toString(){
             /*
             String teksts = super.toString();
             teksts += ", Ietilpība = " + this.kravasIetilpiba;
             
             return teksts;
             */
             return String.format("%s, ietilpiba = %s"
                     ,super.toString()
                    , this.kravasIetilpiba);
         }
}
