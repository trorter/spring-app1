package io.ledovskikh.andrey;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Andrey Ledovskikh
 */
public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        final MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        final MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        firstMusicPlayer.playMusic();

        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());

        secondMusicPlayer.setVolume(100);

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        context.close();
    }
}
