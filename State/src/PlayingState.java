public class PlayingState implements MusicState {

    private MusicPlayer context;

    public PlayingState(MusicPlayer context){
        this.context = context;
        context.setState(this); // Dependency injection
    }

    // Does "nothing"
    @Override
    public void play() { System.out.println("Already playing!"); }

    // Do pause
    @Override
    public void pause() {
        System.out.println("Pausing...");
        new PauseState(context); // With dependency injection
    }

    @Override
    public void toggle() {
        pause();
    }
}
