package Dicegame;

public class Dievalues {
    public Die Dice_1;
    public Die Dice_2;
    public int sum;
    public int n;
    public Dievalues(int n){
        this.n=n;
        Dice_1= new Die();
        Dice_2= new Die();
    }

    public void roll() {
        if(n==-1){

        
        Dice_1.roll();
        Dice_2.roll();
        } 
        else{
            Dice_1.faceValue =n;
            Dice_2.faceValue =n;
        }
    }

    public int sumFace() { if(n==-1){

    
        sum = Dice_1.faceValue + Dice_2.faceValue;
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





