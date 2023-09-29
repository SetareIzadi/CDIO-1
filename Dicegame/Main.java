package Dicegame;

public class Main {

    public static void main(String[] args) {

        final Player player1 = new Player();
        final Player player2 = new Player();
        Dievalues roll = new Dievalues();

        while (player1.getScore() < 40 && player2.getScore() < 40) {
            // Player 1's turn
            System.out.println("__________________");
            System.out.println("Player 1's turn");
            playTurn(player1, roll);

            if (player1.getScore() >= 40) {
                System.out.println("Congratulations, Player 1 won the Dice game with: " + player1.toStringTotalScore());
                break;
            }

            // Player 2's turn
            System.out.println("__________________");
            System.out.println("Player 2's turn");
            playTurn(player2, roll);

            if (player2.getScore() >= 40) {
                System.out.println("Congratulations, Player 2 won the Dice game with: " + player2.toStringTotalScore());
                break;
            }
        }
    }

    public static void playTurn(Player player, Dievalues roll) {
        roll.Dievalue();
        System.out.println(roll.toStringValueOfDies());

        // Handle the roll
        if (!roll.checkForDouble()) {
            roll.sumFace();
            player.sumScore(roll.getSum());
            System.out.println(player.toStringTotalScore());
        } else {
            if (roll.checkIfDoubleone()) {
                System.out.println("Too bad you rolled two ones and have to start over :( ");
                player.startOver(true);
                System.out.println(player.toStringTotalScore());
            } else {
                while (roll.checkForDouble()) {
                    // Player gets an extra turn
                    roll.sumFace();
                    player.sumScore(roll.getSum());
                    System.out.println(player.toStringTotalScore());
                    System.out.println("You rolled two of a kind!, you get an extra turn!");

                    roll.Dievalue(); // Roll the dice for the extra turn
                    System.out.println(roll.toStringValueOfDies());

                    if (roll.checkForNotSixOne()) {
                        continue;
                    } else if (roll.checkIfDoubleone()) {
                        System.out.println("Too bad you rolled two ones and have to start over :( )");
                        player.startOver(true);
                        System.out.println(player.toStringTotalScore());
                        break;
                    } else if (roll.checkForTwoSix()) {
                        player.sumScore(40);
                        break;
                    } else {
                        roll.sumFace();
                        player.sumScore(roll.getSum());
                        System.out.println(player.toStringTotalScore());
                    }
                }
            }
        }
    }
}
