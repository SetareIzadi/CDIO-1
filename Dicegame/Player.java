package Dicegame;

public class Player {

    public int score;
    public String name;

    public Player(String playerName) {
        name = playerName;

    }

    public void sumScore(final int sum) {
        score += sum;
    }

    public int getScore() {
        return score;
    }

    public void startOver(final boolean input) {
        if (input) {
            score = 0;
        }
    }

    public String toStringTotalScore() {
        return "Total Score " + score;
    }

    public String toStringWinner(final String player) {
        return "Congratulations " + player + " You won!";
    }

    public String toStringTwoOnes() {
        return "You rolled two ones. You lose your points and your turn";
    }
}



