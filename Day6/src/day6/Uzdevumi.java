/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

import java.util.Scanner;

/**
 *
 * @author Matiss-Study
 */
public class Uzdevumi {
        private static Scanner ievade = new Scanner(System.in);

    public static void uzd26() {
        System.out.println("Ievadi cik daudz skaitlus velies ievadit");
        
        int n = ievade.nextInt();
        
        int[] skaitluMasivs = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Ievadi Skaitli");
            skaitluMasivs[i] = ievade.nextInt();
        }
        int lielakais = skaitluMasivs[0];
        int mazakais = skaitluMasivs[0];
        
        for(int i = 0; i < n; i++){
            if(lielakais < skaitluMasivs[i]){
                lielakais = skaitluMasivs[i];
            }
        if(mazakais > skaitluMasivs[i]){
           mazakais = skaitluMasivs[i];
            }
            
        }
        System.out.println("lielakais skaitlis ir = " + lielakais);
        System.out.println("mazakais skaitlis ir = " + mazakais);

        
}
    
    public static void uzd28(){
        System.out.println("Cik skaitlus ievadisi 1. masivā?");
        int n = ievade.nextInt();
        
        int[] skaitluMasivs = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Ievadi Skaitli");
            skaitluMasivs[i] = ievade.nextInt();
        }
        
    
    
    System.out.println("Cik skaitlus ievadisi 2. masivā?");
        int m = ievade.nextInt();
        
        int[] skaitluMasivs2 = new int[m];
        for(int i = 0; i < m; i++){
            System.out.println("Ievadi Skaitli");
            skaitluMasivs2[i] = ievade.nextInt();
        }

        for(int j = 0; j < n; j++){
            for(int i = 0; i < m; i++){
                if(skaitluMasivs[j] == skaitluMasivs2[i]){
                    int skaitlis = skaitluMasivs[i];
                    System.out.println("Abos masivos ir skaitlis = " + skaitlis);
                    break;
            }
        }
        }
    }
}


