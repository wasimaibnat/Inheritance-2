class Daily2 extends Appointment2 {
    /*
     * daily appointment handling
     */
    Daily2(int MAX_APPOINTMENTS) {
        super(MAX_APPOINTMENTS);
    }

    public void occursOn(int year, int month, int day) {
        /*
         * search and display daily appointments
         */
        for (int i = 0; i < total; i++) {
            if (this.date[i].substring(0, 4).equals(String.valueOf(year))) {
                System.out.println("\tDaily" + "\t\t" + this.description[i]);
            }
        }
    }
}