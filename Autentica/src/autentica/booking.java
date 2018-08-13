/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autentica;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Matiss-Study
 */
public class booking {
    public String id;
    public String bike_id;
    public String date;
    public String hour_of_day;
    public String start;
    public String end;

    public booking(String id, String bike_id, String hour_of_day, String start, String end) {
        this.id = id;
        this.bike_id = bike_id;
        this.hour_of_day = hour_of_day;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        
        
        return  id + " , " + bike_id + " , " + hour_of_day.toString() + " , " + start + " , " + end;
    }

    

    
    
}
    
    
   


