package Dicegame;

public class Main{

public static void main(String[] args) {

final Player player1 = new Player();
final Player player2 = new Player();
final Dievalues roll = new Dievalues();

while(player1.getScore()<40 && player2.getScore()<40){

    // Player 1 loop first
    System.out.println("__________________");
    System.out.println("Player 1's turn");
    roll.Dievalues();
    System.out.println(roll.toStringValueOfDies());

 if(!roll.checkForDouble()){
    roll.sumFace();
    player1.sumScore(roll.getSum());
    System.out.println(player1.toStringTotalScore());

 } else{
        while(roll.checkForDouble()) //mulig fejl her
        roll.sumFace();
        player1.sumScore(roll.getSum());
        System.out.println("You rolled two of a kind!, you get an extra turn!");
        System.out.println(player1.toStringTotalScore());
        

        if(roll.checkIfDoubleone()){
            System.out.println("Too bad you rolled two ones and have to start over :( )");
            player1.startOver(true);    
            System.out.println(player1.toStringTotalScore());
            break;

        }if(roll.checkForNotSixOne()){
            continue;
        
        } else if (roll.checkForTwoSix()){
            player1.sumScore(40);
        
        } else {
            roll.sumFace();
            player1.sumScore(roll.getSum());
            System.out.println(player1.toStringTotalScore());
    }
    
} 
    if (player1.getScore() >= 40){
        System.out.println("Congratulations, you won the Dicegame with: ");
    }
        
}
}
}   
// player 2 loop second

