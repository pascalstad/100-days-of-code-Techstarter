public class CE10_MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        long minutes = 525600;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long days = (minutes % 525600) / 1440;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
