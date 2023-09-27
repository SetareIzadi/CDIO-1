package Dicegame;

public class Main {

    public static void main(String[] args) {

        final Player player1 = new Player();
        final Player player2 = new Player();
        final Dievalues roll = new Dievalues();

        while (player1.getScore() < 40 && player2.getScore() < 40) {
            // Player 1's turn
            System.out.println("__________________");
            System.out.println("Player 1's turn");
            roll.Dievalue();
            System.out.println(roll.toStringValueOfDies());

            // Handle the roll
            if (!roll.checkForDouble()) {
                roll.sumFace();
                player1.sumScore(roll.getSum());
                System.out.println(player1.toStringTotalScore());
            } else {
                if (roll.checkIfDoubleone()) {
                    System.out.println("Too bad you rolled two ones and have to start over :( ");
                    player1.startOver(true);
                    System.out.println(player1.toStringTotalScore());
                } else {
                    while (roll.checkForDouble()) {
                        // Player 1 gets an extra turn
                        roll.Dievalue(); // Roll the dice for the extra turn
                        player1.sumScore(roll.getSum());
                        System.out.println("You rolled two of a kind!, you get an extra turn!");
                        System.out.println(player1.toStringTotalScore());
                        System.out.println(roll.toStringValueOfDies());

                        if (roll.checkForNotSixOne()) {
                            continue;
                        } else if (roll.checkIfDoubleone()) {
                            System.out.println("Too bad you rolled two ones and have to start over :( )");
                            player1.startOver(true);
                            System.out.println(player1.toStringTotalScore());
                            break;
                        } else if (roll.checkForTwoSix()) {
                            player1.sumScore(40);
                            break;
                        } else {
                            roll.sumFace();
                            player1.sumScore(roll.getSum());
                            System.out.println(player1.toStringTotalScore());
                        }
                        roll.sumFace();
                    }
                }
            }

            if (player1.getScore() >= 40) {
                System.out.println("Congratulations, Player 1 won the Dice game with: " + player1.toStringTotalScore());
                break;
            } else {
                // Player 2's turn
                System.out.println("__________________");
                System.out.println("Player 2's turn");
                roll.Dievalue();
                System.out.println(roll.toStringValueOfDies());

                // Handle the roll
                if (!roll.checkForDouble()) {
                    roll.sumFace();
                    player2.sumScore(roll.getSum());
                    System.out.println(player2.toStringTotalScore());
                } else {
                    if (roll.checkIfDoubleone()) {
                        System.out.println("Too bad you rolled two ones and have to start over :( ");
                        player2.startOver(true);
                        System.out.println(player2.toStringTotalScore());
                    } else {
                        while (roll.checkForDouble()) {
                            // Player 2 gets an extra turn
                            roll.Dievalue(); // Roll the dice for the extra turn
                            player2.sumScore(roll.getSum());
                            System.out.println("You rolled two of a kind!, you get an extra turn!");
                            System.out.println(player2.toStringTotalScore());
                            System.out.println(roll.toStringValueOfDies());

                            if (roll.checkForNotSixOne()) {
                                continue;
                            } else if (roll.checkIfDoubleone()) {
                                System.out.println("Too bad you rolled two ones and have to start over :( )");
                                player2.startOver(true);
                                System.out.println(player2.toStringTotalScore());
                                break;
                            } else if (roll.checkForTwoSix()) {
                                player2.sumScore(40);
                                break;
                            } else {
                                roll.sumFace();
                                player2.sumScore(roll.getSum());
                                System.out.println(player2.toStringTotalScore());
                            }
                            roll.sumFace();
                        }
                    }
                }

                if (player2.getScore() >= 40) {
                    System.out.println("Congratulations, Player 2 won the Dice game with: " + player2.toStringTotalScore());
                    break;
                }
            }
        }
    }
}