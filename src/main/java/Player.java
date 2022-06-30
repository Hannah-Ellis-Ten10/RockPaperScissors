public interface Player {
    String getName();
    Choice getChoice();
    void addOppoentChoice(String name,Choice choice);
}
