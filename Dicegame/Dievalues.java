package Dicegame;

public class Dievalues {
    public int Dice_1;
    public int Dice_2;
    public int sum;

    public int Dievalue() {
        Dice_1 = new Die().roll();
        Dice_2 = new Die().roll();
        return sum;
    }

    public int sumFace() {
        sum = Dice_1 + Dice_2;
        return sum;
    }

    public int getSum() {
        return sum;
    }

    public String toStringValueOfDies() {
        return "First roll is " + Dice_1 + " Second roll is " + Dice_2;
    }

    public boolean checkForDouble() {
        return (Dice_1 == Dice_2);
    }

    public boolean checkIfDoubleone() {
        return (Dice_1 == 1 && Dice_2 == 1);
    }

    public boolean checkForNotSixOne() {
        return (Dice_1 == Dice_2 && Dice_1 != 1 && Dice_1 != 6);
    }

    public boolean checkForTwoSix() {
        return (Dice_1 == Dice_2 && Dice_1 == 6);
    }
}





