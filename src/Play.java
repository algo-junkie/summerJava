import java.util.ArrayList;
import java.util.List;

public class Play {
    public static void main(String[] args) {
        System.out.println("Play starts here");
        List<IConsole> games = new ArrayList<>();
        games.add(new SportsGame());
        games.add(new VideoGame());
        for (IConsole game : games) {
            game.move();
        }
    }
}
