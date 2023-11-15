public class Main {

    public static void main(String[] args) {

        int myVariable = 50; //statement is the entire line

        myVariable++;
        myVariable--; //also a complete statement

        System.out.println("This is a test"); //also a statement

        System.out.println("This is" +
                " another" +
                " still more."); //one statement over multiple lines

        int anotherVariable=50;myVariable--; System.out.println("myVariable = "+myVariable); //legit line of statements but hard to read
        //highlight code, go to code and click reformat code to get a nice format
//        int anotherVariable = 50;
//        myVariable--;
//        System.out.println("myVariable = " + myVariable);

        if (myVariable == 0) {
            System.out.println("It's now zero");
        }
    }
}
