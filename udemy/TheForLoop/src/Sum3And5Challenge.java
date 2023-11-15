public class Sum3And5Challenge {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int number = 1; count < 5 && number <= 1000; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                sum += number;
                count++;
                System.out.println(number + " can be divided by 3 and 5");
            }
        }
        System.out.println("The total is " + sum);
    }
}
