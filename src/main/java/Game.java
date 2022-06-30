abstract class Game {
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
    protected GameOutcome playSingleGame(){
        GameOutcome outcome ;
        do{
            Choice firstPlayerChoice = player1.getChoice();
            Choice secondPlayerChoice = player2.getChoice();
            player1.addOpponentChoice(player2.getName(),secondPlayerChoice);
            player2.addOpponentChoice(player1.getName(),firstPlayerChoice);
            outcome = runRound(firstPlayerChoice,secondPlayerChoice);
        }while(outcome == GameOutcome.DRAW);
        return outcome;
    }
    abstract public void play();
    public void playBestOf(int rounds){
        System.out.println("Starting best of "+ rounds+" rounds");
        int scoreToWin = 1 + (rounds / 2) ;
        System.out.println("First to "+scoreToWin+" wins");
        System.out.println("--------------------");
        int player1Score = 0 ;
        int player2Score = 0 ;
        int round = 0 ;
        while( player1Score < scoreToWin && player2Score < scoreToWin){
            round++;
            System.out.println("Starting round "+round+" of "+rounds);
            GameOutcome outcome = playSingleGame();
            if(outcome == GameOutcome.PLAYER1WINS){
                player1Score++;
            }
            else{
                player2Score++;
            }
            System.out.println(player1.getName()+" has won "+player1Score+" rounds");
            System.out.println(player2.getName()+" has won "+player2Score+" rounds");
            System.out.println("--------------------------------------------------");
        }
        Player winner = player1Score > player2Score ? player1 : player2;
        System.out.println("Well done "+winner.getName()+" you have won best of "+rounds+" rounds");
    }
}
