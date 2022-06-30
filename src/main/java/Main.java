public class Main {
    static public void main(String[] args){
        Game game = new Game();
        GameOutcome outcome = game.play(Choice.ROCK,Choice.PAPER);
        System.out.println(outcome);
    }
}
