public class CE15_SumOddRange {

    public static void main(String[] args) {
//        System.out.println(sumOdd(1, 10));
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));

    }

    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (end < start || end <= 0 || start <= 0) {
            return -1;
        }
        int sum = 0;

        for (int zahl = start; zahl <= end; zahl++) {
            if (isOdd(zahl)) {
                sum += zahl;
            }
        }
        return sum;

    }
}
