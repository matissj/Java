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
public class Konts {
    
    Scanner ievade = new Scanner(System.in);
    
    Klients klients;
    double naudasAtlikums;
    String valuta;
    

    public Konts(Klients klients, int naudasAtlikums, String valuta) {
        this.klients = klients;
        this.naudasAtlikums = naudasAtlikums;
        this.valuta = valuta;
    }
    
   public Klients getCustomer(){
      return klients;
}
  public String getCustomerName(){
      return "Client name: " + klients.vards;
  }

 public String getBalance(){
     return "Konta atlikums: " + this.naudasAtlikums + " " + valuta; 
 }
 
 public void deposit(){
     
     System.out.println(" Ievadiet Summu ko velaties ieskaitit ");
     double amount = ievade.nextInt();
     if (amount <= 10000){
     naudasAtlikums=+amount;
     System.out.println(" Summa veiksmigi pieskaitita jusu kontam: " + amount);
     }
     else {
         System.out.println("Summa Parsniedz dienas limitu");
     }
 }
 
 public void withdraw() {
     System.out.println("Ievadiet Summu ko velaties iznemt ");
     double amount = ievade.nextInt();
     if(amount <= 500){
     naudasAtlikums=-amount;
     System.out.println("Summa veiksmigi iznemta: " + amount);
     }
     else {
         System.out.println("Summa Parsniedz Dienas limitu");
     }
     }
}
