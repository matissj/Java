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
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        
//        Kvadrats kv1; // kv = 0
//        kv1 = new Kvadrats();//kv1 = Kvadrats Klases objektu
//        
//        kv1.setMalasGarums(5.5);
//        kv1.setKrasa("sarkands");
//        
//        double laukums = kv1.laukums();
//        
//        double perimetrs = kv1.perimetrs(); //funkcijas tiek definetas ar mazo burtu
//    
//        Kvadrats kv2 = new Kvadrats(6, "melns");
//        laukums = kv2.laukums();
//        perimetrs = kv2.perimetrs();
//        
//        System.out.println("Kvadrata 2 laukums = " + laukums);
//        System.out.println("Kvadrata 2 perimetrs = " + perimetrs);
//        System.out.println("Kvadrata 2 krasa = " + kv2.getKrasa());
        

          Telpa telpa1 = new Telpa(3, 3);
          Telpa telpa2 = new Telpa(4, 3);
          Telpa telpa3 = new Telpa(5, 3);
          Telpa telpa4 = new Telpa(6, 3);
          Telpa telpa5 = new Telpa(1, 4);
          
          Klase klase1 = new Klase("9a", telpa1, 30);
          Klase klase2 = new Klase("9b", telpa2, 27);
          Klase klase3 = new Klase("9c", telpa3, 33);
          Klase klase4 = new Klase("9d", telpa5, 30);
          Klase klase5 = new Klase("9e", telpa4, 22);
          
          Skolens sk1 = new Skolens("Janis", "Ozolins", "janiso@inbox.lv", 2000, klase1);
          Skolens sk2 = new Skolens("Vilis", "Podnieks", "vilis@inbox.lv", 1999, klase2);
          Skolens sk3 = new Skolens("Andris", "Argalis", "andris@inbox.lv", 2001, klase3);
          Skolens sk4 = new Skolens("Zilgme", "Ivanova", "zilgme@inbox.lv", 2000, klase2);
          Skolens sk5 = new Skolens("Kristine", "Klava", "kristine@inbox.lv", 2000, klase2);
          Skolens sk6 = new Skolens("Alvis", "Ozolins", "alvis@inbox.lv", 1999, klase5);
          
          Skolotajs skol1 = new Skolotajs("Rudite", "Liepa", "rudza@inbox.lv");
          Skolotajs skol2 = new Skolotajs("Klaudija", "Bikse", "bikse@inbox.lv");
          Skolotajs skol3 = new Skolotajs("Vaida", "Liepa", "vaida@inbox.lv");
          
          MacibuPrieksmets prieksmets1 = new MacibuPrieksmets("Matematika" , telpa1, skol1);
          MacibuPrieksmets prieksmets2 = new MacibuPrieksmets("Biologija" , telpa2, skol2);
          MacibuPrieksmets prieksmets3 = new MacibuPrieksmets("Fizika" , telpa3, skol3);
          
          Vertejums vertejums1 = new Vertejums(prieksmets1, sk1, 7);
          Vertejums vertejums2 = new Vertejums(prieksmets2, sk2, 2);
          Vertejums vertejums3 = new Vertejums(prieksmets3, sk3, 4);
          Vertejums vertejums4 = new Vertejums(prieksmets1, sk5, 9);
          Vertejums vertejums5 = new Vertejums(prieksmets2, sk6, 10);
          
          
          System.out.println(vertejums1.Informacija());
          System.out.println(vertejums2.Informacija());
          System.out.println(vertejums3.Informacija());
          System.out.println(vertejums4.Informacija());
          System.out.println(vertejums5.Informacija());
          
          Auto auto = new Auto();
          Lidmasina lidmasina = new Lidmasina();
          auto.parvietoties();
          lidmasina.parvietoties();
          parvietot(auto);
          parvietot(lidmasina);
          
          Direktors direktors = new Direktors();
          direktors.vards = "Liepins" ;
          direktors.uzvards = "Janis";
          darbiniekaVards(direktors);
          
    }
    
    static void darbiniekaVards(Darbinieks direktors){
        System.out.println(direktors.toString());
    }
    
    static void parvietot(Transportlidzeklis tr){
        tr.parvietoties();
    }
    
}
