import java.util.*;

class Guesser{
    int guessernumber ;
    public int takeNumberGuesser(){
        System.out.println("Guesser guess a number : ");
        Scanner sc = new Scanner(System.in);
        guessernumber = sc.nextInt();

        return guessernumber;
    }
}
class Player{
    int playernumber;
    public int takeNumberPlayer(){
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Player guess a number : ");

       playernumber = sc.nextInt();


        return playernumber;
    }
}

class Umpire{
    int numfromGuesser;
    int numfromPlayer1;
    int numfromPlayer2;
    int numfromPlayer3;

    void CollectfromGuesser(){
        Guesser g = new Guesser();
        numfromGuesser = g.takeNumberGuesser();
    }

    void CollectfromPlayer(){
        Player P1 = new Player();
        numfromPlayer1 = P1.takeNumberPlayer();

        Player P2 = new Player();
        numfromPlayer2 = P2.takeNumberPlayer();

        Player P3 = new Player();
        numfromPlayer3 = P3.takeNumberPlayer();    
    }

    void compare(){
        if(numfromPlayer1 == numfromGuesser){
            if(numfromPlayer2  == numfromGuesser && numfromPlayer3 == numfromGuesser){
                System.out.println("All players won the game ");
            }
            else if(numfromPlayer2 == numfromGuesser){
                System.out.println("Only Player 1 and 2 won the game ");
            }
            else if(numfromPlayer3 == numfromGuesser){
                System.out.println("Only Player 1 and 3 won the game ");
            }    
            else{
                System.out.println("Only Player 1 won the game");
            }     
        }
        else if(numfromPlayer2 == numfromGuesser){
            if(numfromPlayer3 == numfromGuesser){
                System.out.println("Only Player 2 and 3 won the game ");
            }
            else{
                System.out.println("Only Player 2 won the game ");
            }
        }
        else if(numfromPlayer3 == numfromGuesser){
            System.out.println("Only Player 3 won the game");
        }
        else{
            System.out.println("No Player won the game");
        }
    }


}
public class GuesserGameProject{
    public static void main(String[] args) {
        Umpire  U = new Umpire();
        U.CollectfromGuesser();
        U.CollectfromPlayer();
        U.compare();
    }
}