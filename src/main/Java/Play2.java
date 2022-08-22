import java.util.ArrayList;
import java.util.List;

public class Play2 {
    public static void main(String[] args) {
        System.out.println("main.Java.Play starts here");
        List<IConsole> games = new ArrayList<>();
        games.add(new SportsGame());
        games.add(new VideoGame());
        for (IConsole game : games) {
            game.move();
        }
        System.out.println("main.Java.Game Over");
        System.out.println("Grammy");
        System.out.println("On T430 now");
    }
}
