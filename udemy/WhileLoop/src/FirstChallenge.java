public class FirstChallenge {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int evenNumbers = 0;
        int oddNumbers = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                oddNumbers++;
                continue;
            }
            evenNumbers++;
            System.out.println("Even number " + number);
            if (evenNumbers == 5) {
                break;
            }
//            if (isEvenNumber(number)) {
//                System.out.println(number);
//            }
        }
        System.out.println("Total even numbers: " + evenNumbers);
        System.out.println("Total odd numbers: " + oddNumbers);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
