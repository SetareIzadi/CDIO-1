package Dicegame;
import java.util.Random;

public class Die {
    private int faceValue;
    private Random random = new Random();

    public int roll() {
        faceValue = random.nextInt(6) + 1;

        return faceValue;
    }
}



