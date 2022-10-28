
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Appointment[] appointments = new Appointment[2];
        appointments[0] = new Daily(2016, 1, 1, "Clean Room.");
        appointments[1] = new Monthly(2016, 1, 31, "Visit Dentist.");
        System.out.println("Enter a date (year, month, day) to list "
                + "appointments: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        for (int i = 0; i < appointments.length; i++) {
            if (appointments[i].occursOn(year, month, day)) {
                System.out.println(appointments[i]);
            }
        }
    }
}