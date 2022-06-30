public class Game {
    public GameOutcome play(Choice firstPlayerChoice,Choice secondPlayerChoice){
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
}
