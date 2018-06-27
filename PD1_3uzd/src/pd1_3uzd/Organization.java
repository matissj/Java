/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd1_3uzd;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Matiss-Study
 */
public class Organization {
    String Nosaukums;
    Scanner ievade = new Scanner(System.in);
    
    public Organization(String Nosaukums) {
        this.Nosaukums = Nosaukums;
    }
    
List<Darbinieki> darbiniekuSaraksts = new ArrayList<Darbinieki>();

     public void addEmployee(){
System.out.println("DARBINIEKA PIEVIENOSANA");
System.out.println("Ievadi Darbinieka vardu");
String vards = ievade.next();

System.out.println("Ievadi Darbinieka Uzvardu");
String uzvards = ievade.next();

System.out.println("Ievadi Darbinieka Dzimsanas Datumu");
System.out.println("Diena");
int diena = ievade.nextInt();
System.out.println("Menesis");
int menesis = ievade.nextInt();
System.out.println("Gads");
int gads = ievade.nextInt();

DzimsanasDatums dz_d = new DzimsanasDatums(diena, menesis, gads);
System.out.println(dz_d.toString());

Darbinieki darbinieks = new Darbinieki(vards, uzvards, dz_d);    
darbiniekuSaraksts.add(darbinieks);
}
public void fire() {
    
    System.out.println("Ievadi Darbinieka Vardu");
    String vards_atl = ievade.next();
    
    System.out.println("Ievadi Darbinieka Uzvardu");
    String uzvards_atl = ievade.next();
    
    bool irDarbinieks = false; jaizveido arpus cikla
    
    int listLenght = darbiniekuSaraksts.size();
    for(int i= 0; i<listLenght; i++){
        if(darbiniekuSaraksts.get(i).Vards.equals(vards_atl) || darbiniekuSaraksts.get(i).Uzvards.equals(uzvards_atl)){
             darbiniekuSaraksts.remove(i);
             irDarbinieks = true;
             break;
             
        }
        
    }
    if (){
               System.out.println("Darbinieku nebija iespejams atrast");
               break;
        }
}

public void changeData(){
    
    System.out.println("Ievadi Darbinieka Vardu");
    String vards_change = ievade.next();
    
    System.out.println("Ievadi Darbinieka Uzvardu");
    String uzvards_change = ievade.next();
    
    int listLenght = darbiniekuSaraksts.size();
    for(int i=0; i<listLenght; i++){
        if(darbiniekuSaraksts.get(i).Vards.equals(vards_change) || darbiniekuSaraksts.get(i).Uzvards.equals(uzvards_change )){
            System.out.println("Ievadi Jauno Darbinieka Vardu");
            String vards_new = ievade.next(); 
            System.out.println("Ievadi Jauno Darbinieka Uzvardu");
            String uzvards_new = ievade.next(); 
            
            System.out.println("Ievadi Darbinieka Dzimsanas Datumu");
            System.out.println("Diena");
            int diena = ievade.nextInt();
            System.out.println("Menesis");
            int menesis = ievade.nextInt();
            System.out.println("Gads");
            int gads = ievade.nextInt();

            DzimsanasDatums dz_d_new = new DzimsanasDatums(diena, menesis, gads);

            
            
            darbiniekuSaraksts.get(i).Vards = vards_new; 
            darbiniekuSaraksts.get(i).Uzvards = uzvards_new; 
            darbiniekuSaraksts.get(i).dzimsanasDatums = dz_d_new;
        }
        else{
               System.out.println("Darbinieku nebija iespejams atrast");
        }
    }
}
    
    public void printAllEmplyees(){
        int listLenght = darbiniekuSaraksts.size();
        for(int i = 0; i < listLenght ; i++){
            System.out.println(darbiniekuSaraksts.get(i).toString());            
        }
    }
    
}




