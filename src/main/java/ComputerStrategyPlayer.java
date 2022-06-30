public class ComputerStrategyPlayer implements Player{
    Choice myChoice ;
    RandomChoice rng ;

    ComputerStrategyPlayer(){
        rng = new RandomChoice();
        myChoice = rng.getChoice();
    }
    @Override
    public String getName() {
        return "Hard Computer";
    }

    @Override
    public Choice getChoice() {
        return myChoice;
    }

    @Override
    public void addOpponentChoice(String name, Choice choice) {
        //this is where our strategy comes in, see https://www.youtube.com/watch?v=rudzYPHuewc for details
        boolean draw = Choice.isDraw(myChoice,choice);
        if(!draw){
            switch (myChoice){
                case ROCK:
                    myChoice = Choice.SCISSORS;
                    break;
                case PAPER:
                    myChoice = Choice.ROCK;
                    break;
                case SCISSORS:
                    myChoice = Choice.PAPER;
            }
        }
        myChoice = rng.getChoice();
    }
}

