package OOP;
import java.awt.*;
import java.util.Scanner;

public class Introduction {

    public static void main(String[] args) {

       Processor processor = new Processor();
       Ram ram = new Ram();

       processor.setNumberOfCores(5);
       ram.setName("linux");
       Computer computer= new Computer(processor, ram);
       computer.run();


       ButtonComponent buttonComponent=new ButtonComponent();
        System.out.println(AbstractButton.TAG);


        //PLAYERS
        System.out.println("Pleae type in your player");
        Scanner scanner = new Scanner(System.in);
        String player = scanner.nextLine();

        VodPlayer vodPlayer=null;
        if(player.equals("netflix")){
            vodPlayer=new NetflixPlayer();
        }else if (player.equals("hbo")){
            vodPlayer=new HBOPlayer();
        }else {
            vodPlayer=new DefaultPlayer();
        }
        playEpisode(vodPlayer, "Got_S1E6");

    }
static void playEpisode(VodPlayer vodPlayer, String title){
        vodPlayer.play(title);
}

}
