import java.util.Scanner;

public class MyUserInputChallenge {

    public static void main(String[] args) {

        int sum = 0;
        sumOfInput(sum);
    }

    public static void sumOfInput(int sum) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;

        while (count <= 5) {
            System.out.println("Enter number #" + count);

            try {
                sum = checkData(sum, scanner.nextLine());
                count++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid number");
            }

        }
        System.out.println("The sum of your numbers is " + sum);
    }

    public static int checkData(int sum, String userInput) {

        int input = Integer.parseInt(userInput);

        if (input > Integer.MIN_VALUE && input < Integer.MAX_VALUE) {
            return (sum += input);
        } else {
            return -1;
        }
    }
}
