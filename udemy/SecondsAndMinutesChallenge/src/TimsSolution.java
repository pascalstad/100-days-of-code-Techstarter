public class TimsSolution {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945)); //This is the first test case
        System.out.println(getDurationString(-65, 45)); //This is the second test case
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds + "), must be a positive value";
        }

        return getDurationString(seconds / 60, seconds % 60);

        /*
        // Two step approach to get hours
        int minutes = seconds / 60;
        int hours = seconds / 60;
        System.out.println("hours = " + hours);  //remove println Statements - just test case without Debugger

        int remainingMinutes = minutes % 60;
        System.out.println("minutes = " + minutes);  //remove println Statements - just test case without Debugger
        System.out.println("remainingMinutes = " + remainingMinutes);  //remove println Statements - just test case without Debugger

        int remainingSeconds = seconds % 60;
        System.out.println("remainingSeconds = " + remainingSeconds);  //remove println Statements - just test case without Debugger

        // One step approach to get hours (another way to get the result)
        int hours1 = seconds / 3600;
        System.out.println("hours1 = " +hours1);  //remove println Statements - just test case without Debugger

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";


         */
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes + "), must be a positive value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
