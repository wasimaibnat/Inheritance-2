class Onetime2 extends Appointment2 {
    /*
     * onetime appointment handling
     */
    Onetime2(int MAX_APPOINTMENTS) {
        super(MAX_APPOINTMENTS);
    }

    public void occursOn(int year, int month, int day) {
        /*
         * search and display onetime appointments
         */
        String date = year + "-" + month + "-" + day;
        for (int i = 0; i < total; i++) {
            if (this.date[i].equals(date)) {
                System.out.println("\tOnetime" + "\t\t" + this.description[i]);
            }
        }
    }
}