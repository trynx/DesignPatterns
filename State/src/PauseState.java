public class PauseState implements MusicState {

    private MusicPlayer context; // Share between states

    public PauseState(MusicPlayer context){
        this.context = context;
        context.setState(this); // Dependency injection
    }

    // Do play
    @Override
    public void play() {
        System.out.println("Playing..");
        new PlayingState(context);
    }

    // Does "nothing"
    @Override
    public void pause() { System.out.println("Already paused!"); }

    @Override
    public void toggle() {
        play();
    }
}
