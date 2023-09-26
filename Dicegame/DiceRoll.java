package Dicegame;
import java.util.Random;
public class DiceRoll {

    private int Dice_1;
    private int Dice_2;

    public DiceRoll() {
        // Create a Random object
        Random random = new Random();

        // Simulate rolling two dice when creating the object
        Dice_1 = random.nextInt(6) + 1;
        Dice_2 = random.nextInt(6) + 1;
    }

    public int getDice_1() {
        return Dice_1;
    }


    public int getDice_2() {
        return Dice_2;
    }

    public static void main(String[] args) {
        DiceRoll roll = new DiceRoll();

        System.out.println("Dice_1: " + roll.getDice_1());
        System.out.println("Dice_2: " + roll.getDice_2());
        
    }
    }


