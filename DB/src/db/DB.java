/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;

/**
 *
 * @author Matiss-Study
 */
public class DB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        insertToAndQueryDatabase("root", "parole");
        connectToAndQueryDatabase("root", "parole");
        
        

    }
    public static void connectToAndQueryDatabase(String username, String password){
        try {
    Connection con = DriverManager.getConnection(
                         "jdbc:mysql://localhost:3306/mddb?zeroDateTimeBehavior=convertToNull",
                         username,
                         password);

    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT id, name FROM students");

    
    while (rs.next()) {
        int workerID = rs.getInt("id");
        EmployeeIDActionPerformed.add(item);

        

    }
} catch (Exception ex){
    System.out.println(ex.toString());
        
}
    }
    
         
         public static void insertToAndQueryDatabase(String username, String password){
        try {
    Connection con = DriverManager.getConnection(
                         "jdbc:mysql://localhost:3306/mddb?zeroDateTimeBehavior=convertToNull",
                         username,
                         password);

   
    PreparedStatement pstmt = con.prepareStatement("Insert into students values(?, ?)");
    pstmt.setInt(1,Integer.parseInt("114"));
    pstmt.setString(2,"Janis");

    int i = pstmt.executeUpdate();
    
    System.out.println("" + i + "Students pievienots");
    con.close();
    

} catch (Exception ex){
    System.out.println(ex.toString());
        
}
}
         
         public static void blockBookedBikes(){
         
             if
         
         }

}
