public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Pascal"); //println to print out on the next line

        boolean isAlien = false; //set boolean
        if (isAlien == false) { //if-then equals statement
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80; //set int
        if (topScore <= 100) { //if-then smaller or equals statement
            System.out.println("You got the highscore!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) { //AND operator
            System.out.println("Greater than top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) { //OR operator
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) { //short for false
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen"; //set String
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true; //Ternary operator

        if (isDomestic) { //short for true
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double firstValue = 20.00d; //set double
        double secondValue = 80.00d;
        double totalValue = (firstValue + secondValue) * 100.00d; //set double adding multiple variables
        System.out.println("totalValue = " + totalValue);
        double remainderValue = totalValue % 40.00d; //Remainder operator
        System.out.println("remainderValue = " + remainderValue);
        boolean isZero = (remainderValue == 0) ? true : false;
        System.out.println("isZero = " + isZero);
        if (!isZero) {
            System.out.println("got some remainder");
        }

    }
}
