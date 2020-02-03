package b_structural.adapter_demo;

public class MediaAdapter implements MyMediaPlayer{

    AdvancedPlayer advancedMediaPlayer;

    public MediaAdapter(){
        advancedMediaPlayer = new AdvancedPlayer();
//        if(type.equalsIgnoreCase("vlc")) {
////            advancedMediaPlayer = new VlcPlayer();
////        }else if(type.equalsIgnoreCase("mp4")){
////            advancedMediaPlayer = new Mp4Player();
////        }
    }

    @Override
    public void play(String type, String fileName) {

            advancedMediaPlayer.play(type,fileName);

    }
}
