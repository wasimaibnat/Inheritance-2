public class Appointment {
    private String description;
    private int year;
    private int month;
    private int day;

    public Appointment(int year, int month, int day, String description) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public boolean occursOn(int year, int month, int day) {
        return (year == this.year) && (month == this.month) && (day == this.day);
    }

    public String toString() {
        return description;
    }
}