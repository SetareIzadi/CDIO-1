package Dicegame;

public class Dievalues{

private int Dice_1;
private int Dice_2;

private int sum;

public Dievalues() {
    Dice_1 = new Die().roll();
    Dice_2 = new Die().roll();
}

public int sumFace(){
    sum = Dice_1 + Dice_2;
    return sum;

}

public int getSum(){
    return sum;
}
}