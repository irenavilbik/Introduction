package OOP;

public class NetflixPlayer extends VodPlayer {

    @Override
    public void play(String title) {
        System.out.println("playing "+title+" on Netflix");
    }
}
