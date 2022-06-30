public class Game {
    Player player1,player2;
    Game(Player player1,Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    private GameOutcome runRound(Choice firstPlayerChoice,Choice secondPlayerChoice){
        if( Choice.isDraw(firstPlayerChoice,secondPlayerChoice) )
        {
            return GameOutcome.DRAW;
        }
        if( Choice.firstWins(firstPlayerChoice,secondPlayerChoice) ) {
            return GameOutcome.PLAYER1WINS;
        }
        else{
            return GameOutcome.PLAYER2WINS;
        }
    }
    public void play(){
        GameOutcome outcome ;
        do{
            Choice firstPlayerChoice = player1.getChoice();
            Choice secondPlayerChoice = player2.getChoice();
            player1.addOppoentChoice(player2.getName(),secondPlayerChoice);
            player2.addOppoentChoice(player1.getName(),firstPlayerChoice);
            outcome = runRound(firstPlayerChoice,secondPlayerChoice);
        }while(outcome == GameOutcome.DRAW);
        if(outcome == GameOutcome.PLAYER1WINS){
            System.out.println(player1.getName()+" has won");
        }
        else{
            System.out.println(player2.getName()+" has won");
        }
    }
}
