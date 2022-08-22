public class SportsGame extends Game implements IConsole {

    @Override
    public void move() {
        System.out.println("sports starts");
    }

    @Override
    public void gameOn() {
        System.out.println("sports game is on");
    }
}
