import java.util.Locale;
import java.util.Scanner;

public class HumanPlayer implements Player{
    private String name;
    HumanPlayer(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your name?");
        name = userInput.nextLine();
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Choice getChoice() {
        System.out.println("What is your play: Rock, Paper or Scissors?");
        Scanner userInput = new Scanner(System.in);
        while(true){
            try {
                String input = userInput.nextLine().toLowerCase();
                switch (input){
                    case "rock":
                    case "r":
                        System.out.println(name+" chose ROCK");
                        return Choice.ROCK;
                    case "paper" :
                    case "p":
                        System.out.println(name+" chose PAPER");
                        return Choice.PAPER;
                    case "scissors":
                    case "s":
                        System.out.println(name+" chose SCISSORS");
                        return Choice.SCISSORS;
                }
            }
            catch (Exception e){
                System.out.println("Please enter a valid value");
            }
        }
    }

    @Override
    public void addOpponentChoice(String name, Choice choice) {
        System.out.println(name+" chose "+choice);
    }
}
