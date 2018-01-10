public class MusicPlayer {

    private MusicState state;

    public MusicPlayer(){
        setState(new PauseState(this));
    }

    public void setState(MusicState state){
        this.state = state;
    }

    public void play(){
        state.play();
    }

    public void pause(){
        state.pause();
    }

    public void toggle(){
        state.toggle();
    }
}
