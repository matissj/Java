/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matiss-Study
 */
public class Uzdevumi {
    private static Scanner ievade = new Scanner(System.in);
    public static void Piemers1(){
        System.out.print("Ievadi Valsti: ");
        String valsts = ievade.next().toLowerCase();
        
        switch (valsts){
            case "lietuva": System.out.println("Viļņa");
                break;
            case "latvija": System.out.println("Rīga");
                break;
            case "igaunija": System.out.println("Tallina");
                break;
            case "krievija": System.out.println("Maskava");
                break;
            default : System.out.println("Sadaa valsts nav");
                break;
        }
    }
    public static void Piemers2(){
        
        System.out.print("Ievadi 1. Skaitli");
        int d1 = ievade.nextInt();
        System.out.print("Ievadi 1. darbibu");
        char darbiba1 = ievade.next().charAt(0);
        
        System.out.print("Ievadi 2. Skaitli");
        int d2 = ievade.nextInt();
        System.out.print("Ievadi 2. darbibu");
        char darbiba2 = ievade.next().charAt(0);
        
        System.out.print("Ievadi 3. Skaitli");
        int d3 = ievade.nextInt();
        
        int rezultats1 = 0;
        int rezultats2 = 0;
        
        if((darbiba1 == '+' || darbiba1 == '-') && (darbiba2 == '*' || darbiba2 == '/')){
        
        switch(darbiba2){
            case '*' :rezultats2 = d2 * d3;
                break;
            case '/' :rezultats2 = d2 / d3;
                break;
        }
        switch(darbiba1){
            case '+' :rezultats1 = d1 + rezultats2;
                break;
            case '-' :rezultats1 = d1 - rezultats2;
                break;
        }
    }
        else {
             switch(darbiba1){
            case '+' :rezultats1 = d1 + d2;
                break;
            case '-' :rezultats1 = d1 - d2;
                break;
            case '*' :rezultats1 = d1 * d2;
                break;
            case '/' :rezultats1 = d1 / d2;
                break;
        }   
             
             
             
             switch(darbiba2){
            case '+' :rezultats2 = rezultats1 + d2;
                break;
            case '-' :rezultats2 = rezultats1 - d2;
                break;
            case '*' :rezultats2 = rezultats1 * d2;
                break;
            case '/' :rezultats2 = rezultats1 / d2;
                break;

                }
             
             System.out.println("Rezultats = " + rezultats2);
        }
    }
    
    public static void MasiviSaraksti(){
        int[] skaitluMasivs = new int[3];
        skaitluMasivs[0] = 5;
        skaitluMasivs[1] = 3;
        skaitluMasivs[2] = 4;
        
        int[] skaitluMasivs2 = {5,9,1};
        int masivaIeraksti = skaitluMasivs2.length;
        int tresaisSkaitlis = skaitluMasivs2[2];
        
        bool irCetri = false;
        
        for(int skaitlis : skaitluMasivs2){
            System.out.println(skaitlis); // sis ir foreach cikls JAVAA
            if(skaitlis == 4) {
                System.out.println("Skailis 4 ir masivaa");
                irCetri = true;
            }
        }
        if(!irCetri){
            System.out.println("Skaitlis 4 nav masivāā");
        }
                
        ArrayList<String> tekstaSaraksts = new ArrayList<String>();
        tekstaSaraksts.add("teksts1");
        tekstaSaraksts.add("teksts2");
        tekstaSaraksts.add("teksts3");
        tekstaSaraksts.add("teksts4");
        
        int sarakstaIeraksti = tekstaSaraksts.size();
        String tresaisVards = tekstaSaraksts.get(2);
        
        for(String vards : tekstaSaraksts){
            System.out.println(vards);
        }
    }
    
    }



