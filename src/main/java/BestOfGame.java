public class BestOfGame extends Game{
    int rounds;
    BestOfGame(Player player1,Player player2,int rounds){
        super(player1,player2);
        this.rounds = rounds;
    }
    @Override
    public void play(){
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
