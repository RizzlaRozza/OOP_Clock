package OOP_Clock;

/**
 * References taken from: https://www.tutorialspoint.com/java/lang/system_currenttimemillis.htm
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class rtClock {

    // uses the imported date and time, formats it correctly and returns the result as newDate
    public static String rtClock(){
        System.currentTimeMillis();
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        String newDate = formatter.format(date);
        System.out.println(newDate);
        return newDate;
    }
}

