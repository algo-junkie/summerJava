public class VideoGame implements IConsole, ISoundService{
    @Override
    public void move() {
        System.out.println("video moves");
    }

    @Override
    public void TurnOnMusic() {
        System.out.println("music is on");
    }

    @Override
    public void TurnOffMusic() {
        System.out.println("music is gone !!");
    }
}
