public class Test {
    public static void main(String[] args) {

        final int MAX_APPOINTMENTS = 10; // maximum number of appointments

        Onetime2 onetime = new Onetime2(MAX_APPOINTMENTS); // object of onetime appointments
        Daily2 daily = new Daily2(MAX_APPOINTMENTS); // object of daily appointments
        Monthly2 monthly = new Monthly2(MAX_APPOINTMENTS); // object of monthly appointments

        int ch = -1;
        String date;
        String description;
        do {
            /*
             * 
             * Loop until user give exit command
             * 
             */
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                /*
                 * display main menu
                 */
                System.out.println("1. Add an appointment");
                System.out.println("2. Search for appointments");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                ch = Integer.parseInt(br.readLine());

                switch (ch) {
                    case 1:
                        /*
                         * adding an appointment
                         */
                        date = "";
                        /*
                         * getting appointment details from user
                         */
                        System.out.print("\tEnter appointment year: ");
                        date += br.readLine() + "-";
                        System.out.print("\tEnter appointment month: ");
                        date += br.readLine() + "-";
                        System.out.print("\tEnter appointment day: ");
                        date += br.readLine();

                        System.out.print("\tEnter appointment description: ");
                        description = br.readLine();

                        /*
                         * getting appointment type
                         */
                        System.out.println("\tEnter appointment tyepe: ");
                        System.out.println("\t\t1. Onetime\n\t\t2. Daily\n\t\t3. Monthly");
                        System.out.print("\t\tEnter your choice: ");
                        ch = Integer.parseInt(br.readLine());

                        switch (ch) {
                            case 1:
                                /*
                                 * appointment type is onetime
                                 */
                                onetime.addAnAppointment(date, description);
                                break;
                            case 2:
                                /*
                                 * appointment type is daily
                                 */
                                daily.addAnAppointment(date, description);
                                break;
                            case 3:
                                /*
                                 * appointment type is monthly
                                 */
                                monthly.addAnAppointment(date, description);
                                break;
                            default:
                                /*
                                 * invalid choice given
                                 */
                                System.out.println("\t\tInvalid appointment type !!!");
                                break;
                        }
                        break;

                    case 2:
                        /*
                         * display appointments on particular day
                         */
                        int year, month, day;
                        /*
                         * getting date from user
                         */
                        System.out.print("\tEnter year: ");
                        year = Integer.parseInt(br.readLine());
                        System.out.print("\tEnter month: ");
                        month = Integer.parseInt(br.readLine());
                        System.out.print("\tEnter day: ");
                        day = Integer.parseInt(br.readLine());

                        /*
                         * displaying all appointments on that day
                         */
                        System.out
                                .println("\n\tDetails of appointments on " + year + "-" + month + "-" + day + " are:");
                        System.out.println("\tType:\t\tDescription:");
                        onetime.occursOn(year, month, day);
                        daily.occursOn(year, month, day);
                        monthly.occursOn(year, month, day);
                        System.out.println("\n");
                        break;

                    case 0:
                        /*
                         * exit from loop
                         */
                        return;

                    default:
                        /*
                         * invalid choice given
                         */
                        System.out.println("\tInvalid choice !!!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (ch != 0);
    }
}