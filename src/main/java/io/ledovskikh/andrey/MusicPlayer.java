package io.ledovskikh.andrey;

import java.util.List;

/**
 * @author Andrey Ledovskikh
 */
public class MusicPlayer {
    private List<Music> musicList;

    private String name;
    private int volume;

    public MusicPlayer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        this.musicList.parallelStream().forEach(value -> System.out.println(value.getSong()));
    }
}
