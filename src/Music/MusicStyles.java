package Music;

public class MusicStyles {
    void playMusic() {
    }
    public static void main(String[] args) {
    PopMusic popMusic = new PopMusic();
    RockMusic rockMusic = new RockMusic();
    ClassicMusic classicMusic = new ClassicMusic();

    MusicStyles[] musicStyles = new MusicStyles[] {rockMusic, popMusic, classicMusic};
        for (MusicStyles music : musicStyles) {
            music.playMusic();
        }
    }
}