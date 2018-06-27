/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd1_2uzd;

import java.util.Scanner;

/**
 *
 * @author Matiss-Study
 */
public class PD1_2uzd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner ievade = new Scanner(System.in);
        
        System.out.println(" KONTA IZVEIDE ");
        System.out.println();
        System.out.println(" Ievadiet Vardu ");
        String vards = ievade.next();
        System.out.println(" Ievadiet Uzvardu ");
        String uzvards = ievade.next();
        System.out.println(" Ievadiet Dzimumu (V/S) ");
        char dzimums = ievade.next().charAt(0);
        System.out.println(" Ievadiet Konta Valutu ");
        String valuta1 = ievade.next();
        
        Klients k1 = new Klients(vards, uzvards, dzimums);
        Konts konts1 = new Konts(k1,0, valuta1 );
        
        String option = " ";
        
        while(option != "exit"){
        System.out.println(" Izvelieties darbibu ");
        System.out.println(" getCustomer / getCustomerName / getBalance / deposit / withdraw / exit ");
        
        option = ievade.next();
                
        switch (option){
            case "getCustomer": System.out.println(k1.getClass());
                break;
            case "getCustomerName": System.out.println(konts1.getCustomer());
                break;
            case "getBalance": System.out.println(konts1.getBalance());
                    break;  
            case "deposit":  konts1.deposit();
                break;
            case "withdraw": konts1.withdraw();
                break;
            case "exit":
                return;
        }
    }
        
    }    
}
