import java.util.Random;

public class ComputerRandomPlayer implements Player{
    Random rng;
    ComputerRandomPlayer(){
        rng = new Random();
    }
    @Override
    public String getName() {
        return "Computer";
    }

    @Override
    public Choice getChoice() {
        Choice[] choices = Choice.values();
        int randomIndex = rng.nextInt(choices.length);
        return choices[randomIndex];
    }

    @Override
    public void addOppoentChoice(String name,Choice choice) {
        //Do nothing, we don't care what out opponent did
    }

}
