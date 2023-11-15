public class MySolution {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        if (seconds < 0) {
            System.out.println("Seconds should be greater than 0");
        }
        return getDurationString(seconds, minutes);
    }

    public static String getDurationString(int seconds, int minutes) {
        int hours = minutes / 60;
        minutes = minutes % 60;
        seconds = seconds % 60;

        if (seconds < 0 || seconds > 59) {
            System.out.println("Seconds should be greater than 0 and less than 59");
        } else if (minutes < 0) {
            System.out.println("Minutes should be greater than 0");
        }
        return hours + "h " + minutes + "m " + seconds + "s";
    }
}