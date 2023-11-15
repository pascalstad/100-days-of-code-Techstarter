import java.util.Scanner;

public class CE28_InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                count++;
                sum += number;
            } catch (NumberFormatException nfe) {
                double avg = (double) sum / count;
                long roundedAVG = Math.round(avg);
                System.out.println("SUM = " + sum + " AVG = " + roundedAVG);
                break;
            }
        }
    }
}
