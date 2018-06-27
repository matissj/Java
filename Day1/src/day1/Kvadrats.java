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
public class Kvadrats {
    
    private double MalasGarums; //pec noklusejuma protected
    
    private String Krasa;
    
    public Kvadrats(){
        
    }

    public Kvadrats(double MalasGarums, String Krasa) {
        this.MalasGarums = MalasGarums;
        this.Krasa = Krasa;
    }
    
    

    public double getMalasGarums() { //PIELIETO JA VERTIBAS IR PRIVATAS
        return MalasGarums;
    }

    public void setMalasGarums(double MalasGarums) {
        
        if(MalasGarums < 0){
            MalasGarums = 0;
        }
        this.MalasGarums = MalasGarums;
    }

    public String getKrasa() {
        return Krasa;
    }

    public void setKrasa(String Krasa) {
        this.Krasa = Krasa;
    }
    
    public double laukums(){
        return this.MalasGarums*this.MalasGarums; // obligati ja sarkit ievadparametrs ar klases ipasibu jalieto this. 
    }
    
    public double perimetrs(){
        return this.MalasGarums *4;
    }
    
}
