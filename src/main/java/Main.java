import java.util.Optional;
import java.util.Scanner;

public class Main {
    static private GameFactory promptUserForGameType() {
        Scanner userInput = new Scanner(System.in);
        Optional<Mode> mode;
        do {
            System.out.println("Would you like an easy game or a hard game?");
            mode = Mode.fromString(userInput.nextLine());
        } while (mode.isEmpty());
        int rounds = -1;
        while (rounds <0) {
            System.out.println("How many rounds would you like?");
            System.out.println("\t0 rounds means just a single game");
            System.out.println("\tpositive odd numbers only please");
            try {
                rounds = userInput.nextInt();
                if(rounds % 2== 0){
                    System.out.println("Please enter an odd number of rounds.");
                    rounds = -1;
                    continue;
                }
            } catch (Exception e) {
                rounds = 0;
                System.out.println("Going to assume you meant 0 there");
            }
        }
        return new GameFactory(mode.get(),rounds);
    }
    static public void main(String[] args){
        System.out.println("Welcome to Hannah's Rock Paper Scissors Game");
        GameFactory factory = promptUserForGameType();
        Game game = factory.build();
        game.play();
    }
}
