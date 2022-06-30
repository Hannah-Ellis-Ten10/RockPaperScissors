/*
I figured that Java must have enums just like C++ does, so I did a little googling and found this
https://jenkov.com/tutorials/java/enums.html#:~:text=A%20Java%20Enum%20is%20a,were%20added%20in%20Java%205.
page.
I'm using this to create the Choice enum.
Just letting you know where I got the information from.
 */
public enum Choice {
    ROCK,
    PAPER,
    SCISSORS;

    public static  boolean isDraw(Choice a,Choice b){
        return a==b;
    }
    public static boolean firstWins(Choice a,Choice b){
        switch (a){
            case ROCK:
                return b == SCISSORS;
            case SCISSORS:
                return b == PAPER;
            case PAPER:
                return b == ROCK;
        }
        //Don't know why Java insists on this return statement as it should never get here
        return false;
    }
}
