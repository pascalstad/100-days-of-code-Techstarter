public class MyResult {
    public static void main(String[] args) {

        String playersName = "Tim";
        int highScoreListPosition = 2;

        System.out.println(displayHighScorePosition(playersName, highScoreListPosition));


        int playerScore = 25;

        System.out.println("The result is table number " +
                calculateHighScorePosition(playerScore));
    }

    public static String displayHighScorePosition(String playersName, int highScoreListPosition) {
        String output = playersName + " managed to get into position " + highScoreListPosition + " on the high score list.";
        return output;
    }

    public static int calculateHighScorePosition(int playerScore) {
        int highScore = playerScore;

        if (highScore >= 1000) {
            return 1;
        } else if (highScore >= 500) {
            return 2;
        } else if (highScore >= 100) {
            return 3;
        }
        return 4;
    }
}
