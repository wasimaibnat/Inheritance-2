import java.io.BufferedReader;
import java.io.InputStreamReader;

class Appointment2 {
    int total; // total appointments
    String description[]; // description of appointments
    String date[]; // date of appointments

    Appointment2(int MAX_APPOINTMENTS) {
        /*
         * initializing appointment details
         */
        description = new String[MAX_APPOINTMENTS];
        date = new String[MAX_APPOINTMENTS];
        total = 0;
    }

    public int getTotal() {
        return total;
    }

    public String getDate(int indx) {
        return date[indx];
    }

    public String getDescription(int indx) {
        return description[indx];
    }

    public void addAnAppointment(String date, String description) {
        /*
         * adding new appointment
         */
        this.date[total] = date;
        this.description[total] = description;
        total++;
    }
}