package Dicegame;
public class Player {

public Player() {
} public int score;   


public void sumScore(final int sum){
    score+=sum;
}

public int getScore(){
    return score;
}

public void startOver(final boolean input){
    if (input)
    score=0;
}

public String toStringTotalScore(){
return "Total Score " + score;
}

public String toStringWinner(final String player){
return "Congratulations "+ player + " You won!";
}

public String toStringExtra(){
return "You rolled two of the same dice. You get an extra turn!";
}


public String toStringTwoOnes(){
return "You rolled two ones. You lose your points and your turn";
}
}


