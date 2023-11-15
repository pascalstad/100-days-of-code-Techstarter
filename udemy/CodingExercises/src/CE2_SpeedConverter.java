public class CE2_SpeedConverter {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(75.114));
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            return milesPerHour;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
