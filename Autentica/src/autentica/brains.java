/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package autentica;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Matiss-Study
 */
public class brains {
    
    /**
     *
     */
    public List<booking> bookingList = new ArrayList<>();

    public void addBooking(String eid,String bid,String d,String s, String e){
        
        booking booking1 = new booking(eid,bid,d,s,e);
        
        bookingList.add(booking1);
        System.out.println(bookingList.get(0));
    }
    
      public static void insertToAndQueryDatabase(String username, String password){
        try {
    Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/employeedb?zeroDateTimeBehavior=convertToNull",
                         username,
                         password);

   
    PreparedStatement pstmt = con.prepareStatement("Insert into booking values(?, ?)");
    pstmt.setInt(1,Integer.parseInt("114"));
    pstmt.setString(2,"Janis");

    int i = pstmt.executeUpdate();
    
    System.out.println("" + i + "Students pievienots");
    con.close();
    

} catch (Exception ex){
    System.out.println(ex.toString());
        
}
}

             
}

