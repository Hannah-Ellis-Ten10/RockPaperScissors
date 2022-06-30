public interface Player {
    String getName();
    Choice getChoice();
    void addOpponentChoice(String name, Choice choice);
}
