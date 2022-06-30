import java.util.Optional;

public class GameFactory {
    Mode mode;
    int rounds;

    GameFactory(Mode mode) {
        this.mode = mode;
        this.rounds = 0;
    }

    GameFactory(Mode mode, int rounds) {
        this.mode = mode;
        this.rounds = rounds;
    }

    public Game build() {
        Player computerPlayer = this.mode == Mode.EASY ?
                new ComputerRandomPlayer() :
                new ComputerStrategyPlayer();
        if (rounds > 0) {
            return new BestOfGame(new HumanPlayer(), computerPlayer, rounds);
        } else {
            return new SingleGame(new HumanPlayer(), computerPlayer);
        }
    }
}
