public class CE16_NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(4114114));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = number;
        while (num != 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            num = num / 10;
        }

        return number == reverse;
    }
}
