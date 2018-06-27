/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd1_3uzd;

import static java.awt.AWTEventMulticaster.add;
import java.util.Scanner;

/**
 *
 * @author Matiss-Study
 */
public class Darbinieki {
    
    Scanner ievade = new Scanner(System.in);
    
    String Vards;
    String Uzvards;
    DzimsanasDatums dzimsanasDatums;

    public Darbinieki(String Vards, String Uzvards, DzimsanasDatums dzimsanasDatums) {
        this.Vards = Vards;
        this.Uzvards = Uzvards;
        this.dzimsanasDatums = dzimsanasDatums;
    }

    @Override
    public String toString() {
        return  Vards + " , " + Uzvards + " , " + dzimsanasDatums.toString();
    }
    
   
}

    



