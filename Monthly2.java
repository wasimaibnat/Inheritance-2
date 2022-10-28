class Monthly2 extends Appointment2 {
    /*
     * monthly appointment handling
     */
    Monthly2(int MAX_APPOINTMENTS) {
        super(MAX_APPOINTMENTS);
    }

    public void occursOn(int year, int month, int day) {
        /*
         * search and display monthly appointments
         */
        for (int i = 0; i < total; i++) {
            if (this.date[i].substring(0, 4).equals(String.valueOf(year))
                    && this.date[i].substring(8).equals(String.valueOf(day))) {
                System.out.println("\tMonthly" + "\t\t" + this.description[i]);
            }
        }
    }
}
