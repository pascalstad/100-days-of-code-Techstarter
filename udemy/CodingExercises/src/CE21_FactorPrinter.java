public class CE21_FactorPrinter {

    public static void main(String[] args) {

        System.out.println("First test:");
        printFactors(6);
        System.out.println("Second test:");
        printFactors(32);
        System.out.println("Third test:");
        printFactors(10);
        System.out.println("Fourth test:");
        printFactors(-1);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
