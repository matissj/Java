/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Matiss-Study
 */
public class Day10 {
    private static Connection connection;
    public static Scanner sc = new Scanner(System.in);
    
    private static void ConnectDB(String username, String password) {

        try{
       connection = DriverManager.getConnection(
                         "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull",
                         username,
                         password);
    }
    catch (Exception ex){
        System.out.println(ex.toString());
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ConnectDB("root", "parole");
    
    System.out.println("Izvelies darbibu: ");
    System.out.println("0 - partraukt darbibu");
    
    System.out.println("1 - apskatit darbiniekus");
    System.out.println("2 - pievienot darbiniekus");
    
    while(true){
        String darbiba = sc.next();
        switch(darbiba){
            case "0": return;
            case "1": printEmployees();
            break;
            case "2": insertEmployee();
            break;
        }
    }

    }
    
    private static void printEmployees(){
            try {
    Statement stmt = connection.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

    while (rs.next()) {
        int emp_if = rs.getInt("emp_if");
        String emp_name = rs.getString("emp_name");
        String job_name = rs.getString("job_name");
        int manager_id = rs.getInt("manager_id");
        Date hire_date = rs.getDate("hire_date");
        float salary = rs.getFloat("salary");
        float commision = rs.getFloat("commission");
        int dep_id = rs.getInt("dep_Id");
        
        
        System.out.printf("id= %s, name= %s, hireDate= %s " + "salary = %s \n", emp_if, emp_name, hire_date, salary);
        
        

    }

} catch (Exception ex){
    System.out.println(ex.toString());
        
}
    }
    
    private static void insertEmployee(){
    try{
    Statement stmt = connection.createStatement();
   
    System.out.println("Ievadi ID");
    int id = sc.nextInt();
    System.out.println("Ievadi Vardu");
    String vards = sc.next();
    System.out.println("Ievadi ievadi Datumu (GGGG-MM-DD)");
    String datums = sc.next();
    System.out.println("Ievadi Algu");
    int alga = sc.nextInt();
    
    stmt.executeUpdate(String.format("INSERT INTO employees(emp_if,emp_name, hire_date, salary ) VALUES (%s, '%s', '%s', %s)", id,vards,datums,alga));
    }catch (Exception ex){
        System.out.println(ex.toString());
    }
    }
}

 
        
        
        



