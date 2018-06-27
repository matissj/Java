/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_ievade;

import java.util.Scanner;

/**
 *
 * @author Matiss-Study
 */
public class Day2_Ievade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*        Scanner ievade = new Scanner(System.in);
        
        System.out.println(" Ievadi Gradus ");
        double gradi = ievade.nextInt();
        
        System.out.println("Ievadi Skalu C / F");
        char merv = ievade.next().charAt(0);
        
        double farenheits;
        double celsijs;
        
        merv = Character.toUpperCase(merv);
                
                
        if(merv == 'C') {
            farenheits = gradi * 1.8 +32;
            System.out.println(farenheits + 'F');            
        }
        
        if(merv == 'F') {
            celsijs = (gradi - 32) / 1.8;
            System.out.println(celsijs + 'F');  
        }
        
*/

        Scanner ievade = new Scanner(System.in);        

        System.out.println("Ievadi Attalumu");
        int attalums = ievade.nextInt();
        
        System.out.println("Ievadi Laiku (min) ");
        int laiks = ievade.nextInt();
        
        System.out.println("Pateretā Degviela (l)");
        int pateretaDegviela = ievade.nextInt();
        
        
        
        double laiks_h = laiks/60;
        System.out.println("Pateretais Brauciena Laiks (h) = " + laiks_h);
        
        double laiks_sek = laiks*60;
        System.out.println("Pateretais Brauciena Laiks (sec) = " + laiks_sek);
        
        double km_min = attalums/laiks;
        System.out.println("Atrum Km/Min = " + km_min);
        
        double km_h = attalums/laiks_h;
        System.out.println("Atrum Km/Min = " + km_h);
        
        double vid_pat = attalums/pateretaDegviela;
        System.out.println("Atrum Km/Min = " + vid_pat);
        
        double km100_pat = vid_pat/100;
        System.out.println("Atrum Km/Min = " + km100_pat);
        
        

    }
    
}
