import MediaPlayer.MediaPlayer;

public class Main {

    public static void main(String[] args) {
        System.out.println("master branch");
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.play();
        mediaPlayer.pause();
        mediaPlayer.play();
    }
}