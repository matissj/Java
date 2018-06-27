/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd1;

import java.util.Scanner;

/**
 *
 * @author Matiss-Study
 */
public class PD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ievade = new Scanner(System.in);
        
        System.out.println(" Ievadi Figuru: kvadrats, taisnsturis, trijsturis, piecsturis ");
        String figura = ievade.next();
        
        switch (figura) {
            case "kvadrats" : 
                System.out.println(" Ievadi Malas Garumu (cm) ");
                int mala = ievade.nextInt();

                Square kv1 = new Square(mala);
                double laukums = kv1.laukums();
                double perimetrs = kv1.perimetrs();
                System.out.println("Kvadrata Laukums = " + laukums );
                System.out.println("Kvadrata Perimetrs = " + perimetrs );
                
                break;
                
           case "taisnsturis" : 
                System.out.println(" Ievadi taisnstura 1 malu (cm) ");
                int vienaMala = ievade.nextInt();
                System.out.println(" Ievadi taisnstura 1 malu (cm) ");
                int otraMala = ievade.nextInt();
                
                Rectangle taisn1 = new Rectangle(vienaMala,otraMala);
                
                double  laukumsTaisn = taisn1.laukums();
                double perimetrsTaisns = taisn1.perimetrs();
                
                System.out.println("taisnstura Laukums = " + laukumsTaisn );
                System.out.println("taisnstura Perimetrs = " + perimetrsTaisns );
                
                break;
                
         case "trijsturis" : 
                System.out.println(" Ievadi Trijustura 1 malu (cm) ");
                int tVienaMala = ievade.nextInt();
                System.out.println(" Ievadi Trijustura 2 malu (cm) ");
                int tOtraMala = ievade.nextInt();
                System.out.println(" Ievadi Trijustura 3 malu (cm) ");
                int tTresaMala = ievade.nextInt();
                
                Triangle ts1 = new Triangle(2, 4, 5);

                
                double  laukumsTrijst = ts1.laukums();
                double perimetrsTrijst = ts1.perimetrs();
                
                System.out.println("Trijstura Laukums = " + laukumsTrijst );
                System.out.println("Trijstura Perimetrs = " + perimetrsTrijst );
                
                break;
                
         case "piecsturis" : 
                System.out.println(" Ievadi piecstura malu (cm) ");
                int piecMala = ievade.nextInt();
                
                
                Pentagon piec1 = new Pentagon(5);
                
                double  laukumsPiecst = piec1.laukums();
                double perimetrsPiecst = piec1.perimetrs();
                
                System.out.println("Piecstura Laukums = " + laukumsPiecst );
                System.out.println("Piecstura Perimetrs = " + perimetrsPiecst ); 
                
                break;
        
    }
        
  
        
        
        
    }
    
}
