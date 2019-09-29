package OOP_Clock;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

public class Time {

    Scanner kboard = new Scanner(System.in);

    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;
    private int second;
    private String checkMeridiem;

    // Display the time once the variable has been set from option 2 or 3 in the menu
    public void displayTime() {
        System.out.println("The date is: " + day + "/" + month + "/" + year);
        System.out.println("The time is: " + hour + ":" + minute +":" + second + " " + checkMeridiem);
    }

    /** Day */
    // Set the day variable using: default value OR requesting the information (depending on the menu choice)
    public void setDay(int d) {
        if (d < 0){
            System.out.println("Enter day of the month in the format: dd (01,02,03...29,30,31)");
            d = kboard.nextInt();

            /* if user enters more that the 31st of the month, error message returned, else value is passed
            note that at this stage I could set the days of the month by month but that would take ages!! */
            while (d > 31) {
                System.out.println("huh??  Try again...");
                String enter = kboard.nextLine();
                System.out.println("Enter day of the month in the format: dd (01,02,03...29,30,31)");
                d = kboard.nextInt();
            }
        }
        day = d;
    }

    // return the value for the day variable
    public int getDay(){
        return day;
    }

    /** Month */
    // Set the month variable using: default value OR requesting the information (depending on the menu choice)
    public void setMonth(int mo) {

        if (mo < 0){
            System.out.println("Enter the month in the format: mm (01,02,03...10,11,12) ");
            mo = kboard.nextInt();

            while (mo > 12) {
                System.out.println("???   You should be embarrassed!!  Try again...");
                String enter = kboard.nextLine();
                System.out.println("Enter the month in the format: mm (01,02,03...10,11,12) ");
                mo = kboard.nextInt();
            }
        }
        month = mo;
    }

    // return the value for the month variable
    public int getMonth(){
        return month;
    }

    /** Year */
    // Set the year variable using: default value OR requesting the information (depending on the menu choice)
    public void setYear(int y) {
        if (y < 0) {
            System.out.println("Enter the year in the format: yyyy (1985,1986,1987...2017,2018,2019) ");
            y = kboard.nextInt();
        }
        year = y;
    }

    // return the value for the year variable
    public int getYear(){
        return year;
    }

    /** Hour */
    // Set the hour variable using: default value OR requesting the information (depending on the menu choice)
    public void setHour(int h) throws IOException {
        if (h < 0) {
            System.out.println("Enter hour: ");
            h = kboard.nextInt();

            // if user doesn't understand time
            if (h > 23){
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.youtube.com/watch?v=HrxZWNu72WI"));

                while (h > 23){
                    System.out.println("For the love of...");
                    System.out.println("Please try again after watching this helpful video... Enter hour: ");
                    h = kboard.nextInt();
                }
                System.out.println("Congratulations, you've taken your first step towards greatness");
            }
            // check if am or pm
            else if (h >= 13) {
                h = h - 12;
                checkMeridiem = "pm";
            }
            else{
                checkMeridiem = "am";
            }
        }
        hour = h;
    }

    // return the value for the hour variable
    public int getHour(){
        return hour;
    }

    /** Minute */
    // Set the minute variable using: default value OR requesting the information (depending on the menu choice)
    public void setMinute(int m) throws IOException {
        if (m < 0) {
            System.out.println("Enter minute: ");
            m = kboard.nextInt();

            // if user tries to enter more that 59 minutes
            if (m > 59){
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.youtube.com/watch?v=HrxZWNu72WI"));

                while (m > 59){
                    System.out.println("For the love of...");
                    System.out.println("Please try again after watching this helpful video... Enter minute: ");
                    m = kboard.nextInt();
                }
                System.out.println("Congratulations, you've taken your first step towards greatness");
            }
        }
        minute = m;
    }

    // return the value for the minute variable
    public int getMinute(){ return minute; }

    /** Second */
    // Set the second variable using: default value OR requesting the information (depending on the menu choice)
    public void setSecond(int s) throws IOException {
        if (s < 0) {
            System.out.println("Enter second: ");
            s = kboard.nextInt();

            // if user tries to enter more that 59 minutes
            if (s > 59){
                java.awt.Desktop.getDesktop().browse(URI.create("https://www.youtube.com/watch?v=HrxZWNu72WI"));

                while (s > 59){
                    System.out.println("For the love of...");
                    System.out.println("Please try again after watching this helpful video... Enter second: ");
                    s = kboard.nextInt();
                }
                System.out.println("Congratulations, you've taken your first step towards greatness");
            }
        }
        second = s;
    }

    // return the value for the second variable
    public int getSecond(){ return second; }
}
