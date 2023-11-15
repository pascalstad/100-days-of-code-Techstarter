public class CE1_PositiveNegativeZero {

    public static void main(String[] args) { //needed for IntelliJ but not for the exercise in udemy
        checkNumber(0);
    }
    public static void checkNumber (int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        //other solution:
        //System.out.println((number > 0) ? "positive": ((number < 0) ? "negative" : "zero"));
    }
}
