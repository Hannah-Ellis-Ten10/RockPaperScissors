public class ComputerRandomPlayer implements Player{
    RandomChoice rng;
    ComputerRandomPlayer(){
        rng = new RandomChoice();
    }
    @Override
    public String getName() {
        return "Computer";
    }

    @Override
    public Choice getChoice() {
        return rng.getChoice();
    }

    @Override
    public void addOpponentChoice(String name, Choice choice) {
        //Do nothing, we don't care what out opponent did
    }

}
