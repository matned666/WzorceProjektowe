package b_structural.adapter_demo;

public class AdapterMain {
    public static void main(String[] args) {

        MyAudioPlayer audioPlayer = new MyAudioPlayer();

        audioPlayer.play("mp3", "Metallica - Enter Sandmen.mp3");
        audioPlayer.play("vlc", "Vikings S1E1.vlc");
        audioPlayer.play("mp4", "Pulp Fiction.mp4");
        audioPlayer.play("avi", "My_film.avi");

    }
}
