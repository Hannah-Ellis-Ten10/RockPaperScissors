import org.junit.Assert;
import org.junit.Test;

public class TestChoice {
    @Test
    public void RockBeatsScissors(){
        Assert.assertFalse(Choice.isDraw(Choice.ROCK,Choice.SCISSORS));
        Assert.assertTrue(Choice.firstWins(Choice.ROCK,Choice.SCISSORS));
    }
    @Test
    public void RockDrawsRock(){
        Assert.assertTrue(Choice.isDraw(Choice.ROCK,Choice.ROCK));
        Assert.assertFalse(Choice.firstWins(Choice.ROCK,Choice.ROCK));
    }
    @Test
    public void RockLosesToPaper(){
        Assert.assertFalse(Choice.isDraw(Choice.ROCK,Choice.PAPER));
        Assert.assertFalse(Choice.firstWins(Choice.ROCK,Choice.PAPER));
    }

    @Test
    public void PaperBeatsRock(){
        Assert.assertFalse(Choice.isDraw(Choice.PAPER,Choice.ROCK));
        Assert.assertTrue(Choice.firstWins(Choice.PAPER,Choice.ROCK));
    }
    @Test
    public void PaperDrawPaper(){
        Assert.assertTrue(Choice.isDraw(Choice.PAPER,Choice.PAPER));
        Assert.assertFalse(Choice.firstWins(Choice.PAPER,Choice.PAPER));
    }
    @Test
    public void PaperLosesToScissors(){
        Assert.assertFalse(Choice.isDraw(Choice.PAPER,Choice.SCISSORS));
        Assert.assertFalse(Choice.firstWins(Choice.PAPER,Choice.SCISSORS));
    }

    @Test
    public void ScissorsBeatsPaper(){
        Assert.assertFalse(Choice.isDraw(Choice.SCISSORS,Choice.PAPER));
        Assert.assertTrue(Choice.firstWins(Choice.SCISSORS,Choice.PAPER));
    }
    @Test
    public void ScissorsDrawScissors(){
        Assert.assertTrue(Choice.isDraw(Choice.SCISSORS,Choice.SCISSORS));
        Assert.assertFalse(Choice.firstWins(Choice.SCISSORS,Choice.SCISSORS));
    }
    @Test
    public void ScissorsLosesToRock(){
        Assert.assertFalse(Choice.isDraw(Choice.SCISSORS,Choice.ROCK));
        Assert.assertFalse(Choice.firstWins(Choice.SCISSORS,Choice.ROCK));
    }
}
