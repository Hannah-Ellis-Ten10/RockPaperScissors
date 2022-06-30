public class Main {
    static public void main(String[] args){
        Game game = new Game(new HumanPlayer(),new ComputerRandomPlayer());
        game.play();
    }
}
