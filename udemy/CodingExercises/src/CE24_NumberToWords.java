public class CE24_NumberToWords {

    public static void main(String[] args) {

        System.out.println("First test (123):");
        numberToWords(123);
        System.out.println("Second test (1010):");
        numberToWords(1010);
        System.out.println("Third test (1000):");
        numberToWords(1000);
        System.out.println("Fourth test (-12):");
        numberToWords(-12);
    }
    
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int count = getDigitCount(number);
        number = reverse(number);
        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            count--;
            if (digit == 0) {
                System.out.println("Zero");
            } else if (digit == 1) {
                System.out.println("One");
            } else if (digit == 2) {
                System.out.println("Two");
            } else if (digit == 3) {
                System.out.println("Three");
            } else if (digit == 4) {
                System.out.println("Four");
            } else if (digit == 5) {
                System.out.println("Five");
            } else if (digit == 6) {
                System.out.println("Six");
            } else if (digit == 7) {
                System.out.println("Seven");
            } else if (digit == 8) {
                System.out.println("Eight");
            } else if (digit == 9) {
                System.out.println("Nine");
            }
        }
        while (count > 0) {
            System.out.println("Zero");
            count--;
        }
    }

    public static int reverse(int number) {

        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber *= 10;
            int digit = number % 10;
            reversedNumber += digit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
