public class CE20_LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(45, 65, 1001));
        System.out.println(hasSameLastDigit(11, 12, 13));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
        System.out.println(isValid(9));
        System.out.println(isValid(1000));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (x < 10 || x > 1000 || y < 10 || y > 1000 || z < 10 || z > 1000) {
            return false;
        } else {
            return (x % 10 == y % 10 || x % 10 == z % 10 || y % 10 == z % 10);
        }
    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }
}
