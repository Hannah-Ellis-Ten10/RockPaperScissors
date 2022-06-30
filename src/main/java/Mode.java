import java.util.Optional;

public enum Mode {
    EASY,
    HARD;
    public static Optional<Mode> fromString(String s){
        switch (s.toLowerCase()) {
            case "easy":
            case "e":
                return Optional.of(EASY);
            case "hard":
            case "h":
                return Optional.of(HARD);
            default:
                return Optional.empty();
        }
    }
}
