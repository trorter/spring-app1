package io.ledovskikh.andrey;

import org.springframework.context.annotation.*;

import java.util.Arrays;

/**
 * @author Andrey Ledovskikh
 */
@Configuration
@ComponentScan(value = "io.ledovskikh.andrey")
@PropertySource("musicPlayer.properties")
public class SpringConfig {

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public FolkMusic folkMusic() {
        return new FolkMusic();
    }

    @Bean
    @Scope("prototype")
    public MusicPlayer musicPlayer() {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.setMusicList(Arrays.asList(classicalMusic(), rockMusic(), folkMusic()));
        return musicPlayer;
    }
}
