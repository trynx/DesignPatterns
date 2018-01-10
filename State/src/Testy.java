public class Testy {

    public static void main(String [] args){

        MusicPlayer walkman = new MusicPlayer();

        walkman.play();
        walkman.toggle();
        walkman.play();

        walkman.pause();
        walkman.toggle();
        walkman.pause();
    }
}
