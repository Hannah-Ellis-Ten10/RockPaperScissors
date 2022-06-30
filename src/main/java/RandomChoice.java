import java.util.Random;

public class RandomChoice {
    Random rng;
    RandomChoice(){
        rng = new Random();
    }
    public Choice getChoice() {
        Choice[] choices = Choice.values();
        int randomIndex = rng.nextInt(choices.length);
        return choices[randomIndex];
    }
}
