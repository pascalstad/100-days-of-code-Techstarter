public class MainChallenge {

    public static void main(String[] args) {

//        boolean gameOver = true;                                                  not needed anymore
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//        int finalScore = score;

//        if (gameOver) {                                                           changed to calculateScore method
//            finalScore += (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next highScore is " +
                calculateScore(gameOver, score, levelCompleted, bonus));


//        gameOver = true;                                                                  changed to second calculateScore
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//        finalScore = score;
//
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

//        boolean gameOverChallenge = true;
//        int scoreChallenge = 10000;
//        int levelCompletedChallenge = 8;
//        int bonusChallenge = 200;
//        int finalScoreChallenge = scoreChallenge;
//
//        if (gameOverChallenge) {
//            finalScoreChallenge += (levelCompletedChallenge * bonusChallenge);
//            System.out.println("Your final score was " + finalScoreChallenge);
//        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;

        }

        return finalScore;
    }

}
