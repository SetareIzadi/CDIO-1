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




}

    
    




