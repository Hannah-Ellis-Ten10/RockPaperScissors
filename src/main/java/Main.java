public class Main {
    static public void main(String[] args){
        Game game = new Game();
        Player player1 = new ComputerRandomPlayer();
        Player player2 = new ComputerRandomPlayer();
        GameOutcome outcome;
        do {
            outcome = game.play(player1.getChoice(), player2.getChoice());
        }while(outcome == GameOutcome.DRAW);
        System.out.println(outcome);
    }
}
