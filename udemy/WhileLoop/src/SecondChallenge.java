public class SecondChallenge {

    public static void main(String[] args) {

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1000));
        System.out.println(sumDigits(300));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(-125));
    }

    // My Solution
    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    // Tims Solution
    /*
    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }

        sum += number;
        return sum;
    }
     */
}
