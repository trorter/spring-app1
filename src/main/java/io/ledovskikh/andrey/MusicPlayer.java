package io.ledovskikh.andrey;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * @author Andrey Ledovskikh
 */
//@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MusicPlayer {

//    @Autowired
    private List<Music> musicList;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
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

    public void playMusic() {
        this.musicList.parallelStream().forEach(value -> System.out.println(value.getSong()));
    }

    @PostConstruct
    private void init() {
//        this.musicList = this.musicList.stream().filter(value -> AvailableMusic.isAllowed(value)).collect(Collectors.toList());
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    @PreDestroy
    private void destroy() {
        System.out.println("destroy " + this.getClass());
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "musicList=" + musicList +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
