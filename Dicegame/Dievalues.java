package Dicegame;

public class Dievalues {
    public Die Dice_1;
    public Die Dice_2;
    public int sum;

    public int Dievalue() {
        Dice_1 = new Die().roll();
        Dice_2 = new Die().roll();
        return sum;
    }
    else {
        sum= n+n;
    return sum;
    }
    }

    public int getSum() {
        return sum;
    }

    public String toStringValueOfDies() {
        return "First roll is " + Dice_1.faceValue + " Second roll is " + Dice_2.faceValue;
    }

    public boolean checkForDouble() {
        return (Dice_1.faceValue == Dice_2.faceValue);
    }

    public boolean checkIfDoubleone() {
        return (Dice_1.faceValue == 1 && Dice_2.faceValue == 1);
    }

    public boolean checkForNotSixOne() {
        return (Dice_1.faceValue == Dice_2.faceValue && Dice_1.faceValue != 1 && Dice_1.faceValue != 6);
    }

    public boolean checkForTwoSix() {
        return (Dice_1.faceValue == Dice_2.faceValue && Dice_1.faceValue == 6);
    }
}





