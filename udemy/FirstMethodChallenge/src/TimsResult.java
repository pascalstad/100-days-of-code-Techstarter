public class TimsResult {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScoreposition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(999);
        displayHighScoreposition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(499);
        displayHighScoreposition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
        displayHighScoreposition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(-1000);
        displayHighScoreposition("James", highScorePosition);
    }

    public static void displayHighScoreposition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        //int position = 4;  change, so it's easy to read
        if (playerScore >= 1000) {
            return 1;
            // position = 1; replace return, so it's easy to read
        } else if (playerScore >= 500 && playerScore < 1000) { //(&& playerScore < 1000) unnecessary
            return 2;
            // position = 2; replace return, so it's easy to read
        } else if (playerScore >= 100 && playerScore < 500) { //(&& playerScore < 500) unnecessary
            return 3;
            // position = 3; replace return, so it's easy to read
        } else { //else unnecessary
            return 4; // return position; replace, so it's easy to read
        }
    }
}
