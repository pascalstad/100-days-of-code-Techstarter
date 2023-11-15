import java.util.Scanner;

public class MyMinAndMaxChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double minValue = Double.MAX_VALUE;
        double maxValue = Double.MIN_VALUE;

        while (count >= 0) {
            System.out.println("Enter a number or any character to quit");

            try {
                double number = Double.parseDouble(scanner.nextLine());
                count++;

                if (number <= minValue) {
                    minValue = number;
                }
                if (number >= maxValue) {
                    maxValue = number;
                }
            } catch (NumberFormatException nfe) {
                if (count < 1) {
                    System.out.println("No input");
                    break;
                } else if (count == 1) {
                    System.out.println("Only one entered number, so your min = your max");
                    break;
                } else {
                    System.out.println("From " + count + " entered numbers, your min was " + minValue + " and your max was " + maxValue);
                    break;
                }
            }
        }

    }
}
