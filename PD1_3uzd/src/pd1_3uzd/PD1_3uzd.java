/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd1_3uzd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Matiss-Study
 */
public class PD1_3uzd {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
    Scanner ievade = new Scanner(System.in);
        
    Organization SIA = new Organization("SIA");
    
    String option = "";
    
    while (option != "exit"){
        System.out.println("Choose Action");
        System.out.println("Add Employee / Fire Employee / Change Data / Print All / Exit");
        option = ievade.next().toLowerCase();
        System.out.println(option);
        switch(option){
            case "add": SIA.addEmployee();
                break;
            case "fire": SIA.fire();
                break;
            case "change": SIA.changeData();
                break;
            case "print": SIA.printAllEmplyees();
                break;
            case "exit":;
                return;
            //default: System.out.println("Input Invalid, Try again");
              //  break;
         
        }

    }
    }
    
    
    
    
    
    


    
    
    }
    
