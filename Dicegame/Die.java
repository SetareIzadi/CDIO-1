package Dicegame;

import java.util.Random;

public class Die {
    public int faceValue;
    private Random random = new Random();

    public Die() {

    }

    public int roll() {
        faceValue = random.nextInt(6) + 1;
        return faceValue;
    }
}




