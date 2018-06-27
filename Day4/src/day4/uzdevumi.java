/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Scanner;

/**
 *
 * @author Matiss-Study
 */
public class uzdevumi {
        private static Scanner ievade = new Scanner(System.in);
    public static void uzd4(){ 
        System.out.println("Ievadi Skaitli N");
        int n = ievade.nextInt();
        
        int sum = 0;
      
        for(int i = 1; i <=n; i++){
            System.out.println(i);
            sum = sum + i;
        } 
        
        System.out.println("Summa = " + sum);
    }
    
    public static void uzd5(){
        System.out.println("Ievadi Cik Skaitlus ievadisi");
        int n = ievade.nextInt();
        
        int skaitlis = 0;
        int summa = 0;
        double vidVertiba = 0;
        
        for(int i = 1; i <=n ; i++){
            System.out.println("Ievadi Skaitli");
            skaitlis = ievade.nextInt();
            summa = summa + skaitlis;
        }
        System.out.println("Summa = " + summa);
        vidVertiba = summa / n;
        System.out.println("Videja Vertiba = " + vidVertiba);
            
    }
    
    public static void uzd6(){
        System.out.println("Ievadi Skaitli N");
        int n = ievade.nextInt();
        
        for(int i = 1; i<=n; i++){
            System.out.println(i*i*i);
        }
    }
    
    public static void uzd7(){
        System.out.println("Ievadi Skaitli N");
        int n = ievade.nextInt();
        
        for(int i = 1; i <= n; i++ ){
            for (int j=0;j<i; j++) {
                System.out.print("*");
         }
         System.out.println();
           
        }
        
    }
    
    public static void uzd8(){
        System.out.println("Ievadi Skaitli N");
        int n = ievade.nextInt();
        int parbaude = 1;
        int p = 1;
        
        while(p<=n){
        if(parbaude == 1){
            for(int i = 1; i<= n; i++){
            System.out.print(i);
            parbaude = 2;
        }

        }
           else {
           for( int j = n; j>= 1; j--){
            System.out.print(j);
            parbaude = 1;
 
        }     
                   
        }
         System.out.println();

        p++;
    }
    }
    
       public static void uzd9() {
    System.out.println("Ievadi Skaitli ko velies apgriezt");
        int n = ievade.nextInt();
        int skaitlis;
        int jaunaisSkaitlis = 0;
        int skaitlaGarums = String.valueOf(n).length();
        System.out.println(skaitlaGarums);
        
        
        for(int i=1; i<=skaitlaGarums; i++){
        skaitlis = n % 10;
        jaunaisSkaitlis = jaunaisSkaitlis * 10 +skaitlis;
        n = n / 10;
//int jaunaisSkaitlis = jaunaisSkaitlis + n%10;
        }
        
        System.out.println("Apgriztais skaitlis ir = " + jaunaisSkaitlis);
}
       public static void uzd10(){
        System.out.println("Ievadi Skaitli ko velies apgriezt");
        int n = ievade.nextInt();
        
    
        
       }
       
       
    }
 


