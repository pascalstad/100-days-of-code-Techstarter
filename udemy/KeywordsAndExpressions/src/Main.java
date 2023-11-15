public class Main {

    public static void main(String[] args) {
        int int2 = 5;  //tutorial: int can't be used as a variable, because it's a keyword

        //tutorial: reserved keywords can be found in java documentation

        double kilometers = (100 * 1.609344); //convert kilometers to miles

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore; //add bonus points
        }

        int health = 100; //tutorial: health = 100/one expression

        if((health < 25) && (highScore > 1000)) { //tutorial: health < 25/one expression, highScore > 1000/one expression, (health < 25) && (highScore > 1000)/one expression
            highScore = highScore - 1000; // tutorial: highScore = highScore - 1000/one expression, highScore - 1000/one expression
        }
    }
}
