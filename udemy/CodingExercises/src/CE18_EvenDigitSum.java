public class CE18_EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(246813524));
        System.out.println(getEvenDigitSum(335577));
        System.out.println(getEvenDigitSum(224466));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int digit = 0;
        int sum = 0;

        while (number != 0) {
            digit = number % 10;
            number = number / 10;

            if (digit % 2 == 0) {
                sum += digit;
            }
        }
        return sum;
    }
}
