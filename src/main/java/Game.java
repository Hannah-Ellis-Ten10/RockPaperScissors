public class Game {
    public GameOutcome play(Choice firstPlayerChoice,Choice secondPlayerChoice){
        if( Choice.isDraw(firstPlayerChoice,secondPlayerChoice) )
        {
            return GameOutcome.Draw;
        }
        if( Choice.firstWins(firstPlayerChoice,secondPlayerChoice) ) {
            return GameOutcome.Player1Wins;
        }
        else{
            return GameOutcome.Player2Wins;
        }
    }
}
