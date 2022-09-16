package MediaPlayer;

public class MediaPlayer {

    private State state = new PausedState();
    private String icon;

    public String getIcon() {
        return icon;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

}
