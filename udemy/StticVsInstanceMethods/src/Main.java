class Calculator {

    // Static Method
    public static void printSum(int a, int b) {
        System.out.println("sum = " + (a + b));
    }
}

class Dog {

    // Instance method
    public void bark() {
        System.out.println("woof");
    }
}

public class Main {

    public static void main(String[] args) {

        Calculator.printSum(5,10);
        printHello();           // shorter form of Main.printHello();
    }

    public static void printHello() {
        System.out.println("Hello");
    }

    Dog rex = new Dog();
    rex.bark();
}
