package OOP_Clock;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

public Scanner kboard = new Scanner(System.in);

    private int choice;

    // Menu - allow user to select an option
    public void menu() throws IOException {
        System.out.println("Please select from the following options: ");
        System.out.println("Enter 1 for real-time clock");
        System.out.println("Enter 2 to display a special date and time");
        System.out.println("Enter 3 to configure the home-made 12-hour time format");
        System.out.println("=");

        int choice = kboard.nextInt();

        // stop user breaking the program by picking invalid numbers
        while (choice > 3 && choice != 6) {
            System.out.println("Pick a number 1, 2 or 3... it's not that hard");
            System.out.println(" ");

            System.out.println("Enter 1 for real-time clock");
            System.out.println("Enter 2 to display a special date and time");
            System.out.println("Enter 3 to configure the home-made 12-hour time format");

            choice = kboard.nextInt();
            }

        switch(choice) {
            case 1:
                rtClock.rtClock();
                break;
            case 2:
                Time time = new Time();
                time.setDay(26);
                time.setMonth(10);
                time.setYear(1985);
                time.setHour(01);
                time.setMinute(21);
                time.setSecond(20);
                time.displayTime();
                System.out.println("Great Scott!");
                break;
            case 3:
                Time chooseTime = new Time();
                chooseTime.setDay(-1);
                chooseTime.setMonth(-1);
                chooseTime.setYear(-1);
                chooseTime.setHour(-1);
                chooseTime.setMinute(-1);
                chooseTime.setSecond(-1);
                chooseTime.displayTime();
                break;
            case 6:
                EasterEgg a = new EasterEgg();
                a.loadApplication();
                break;
            default:
                System.out.println("Pick a number 1, 2 or 3... it's not that hard");
        }
    }
}
