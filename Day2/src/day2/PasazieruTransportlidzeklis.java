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
public class PasazieruTransportlidzeklis extends Transportlidzeklis  {
    int maxPasazieri;

    public PasazieruTransportlidzeklis(String razotajs, String marka, int gads, int maxPasazieri) {
        super(razotajs, marka, gads);
        
        this.maxPasazieri = maxPasazieri;
    }
    
          @Override
         public String toString(){

             String teksts = super.toString();
             teksts += ", Maksimalais Pasazieru daudzums = " + this.maxPasazieri;
             
             return teksts;


         }
}
