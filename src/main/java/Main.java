import java.util.Optional;
import java.util.Scanner;

public class Main {
    static private Player promptForComputerPlayerForMode(){
        Scanner userInput = new Scanner(System.in);
        Optional<Mode> mode ;
        do {
            System.out.println("Would you like an easy game or a hard game?");
            mode = Mode.fromString(userInput.nextLine());
        }while(mode.isEmpty());
        return mode.map(x->{
            if(x==Mode.EASY){
                return new ComputerRandomPlayer();
            }
            else{
                return new ComputerStrategyPlayer();
            }
        }).get();
    }
    static public void main(String[] args){
        System.out.println("Welcome to Hannah's Rock Paper Scissors Game");
        Game game = new Game(new HumanPlayer(),promptForComputerPlayerForMode());
        game.play();
    }
}
