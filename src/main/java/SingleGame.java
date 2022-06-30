public class SingleGame extends Game {
    SingleGame(Player player1,Player player2){
        super(player1,player2);
    }
    @Override
    public void play(){
        GameOutcome outcome = playSingleGame();
        if(outcome == GameOutcome.PLAYER1WINS){
            System.out.println(player1.getName()+" has won");
        }
        else{
            System.out.println(player2.getName()+" has won");
        }
    }
}
