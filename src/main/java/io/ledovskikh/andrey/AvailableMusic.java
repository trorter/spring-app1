package io.ledovskikh.andrey;

/**
 * @author Andrey Ledovskikh
 */
public enum AvailableMusic {
    FolkMusic (new FolkMusic()),
    RockMusic (new RockMusic());

    private final Music availableMusic;

    public Music getMusicClass (){
        return this.availableMusic;
    }
    AvailableMusic(Music music) {
        this.availableMusic = music;
    }

    public static boolean isAllowed(Music music) {
        for (AvailableMusic availableMusic: AvailableMusic.values()) {
            if (availableMusic.getMusicClass().getClass().equals(music.getClass())) return true;
        }

        return false;
    }
}
