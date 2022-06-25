package ru.shulpov.springproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestSpring {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );

//        Music music = context.getBean("musicBean", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();

//        Parser parser = context.getBean("parserBean", Parser.class);
//        parser.parse();

        MusicPlayer musicPlayer1 = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayerBean", MusicPlayer.class);

        boolean isSamePlayer = musicPlayer1 == musicPlayer2;

        System.out.println("Один и тот же плеер: " + isSamePlayer);
        System.out.println("musicPlayer1 = " + musicPlayer1);
        System.out.println("musicPlayer2 = " + musicPlayer2);

        musicPlayer1.setName("New player name");
        System.out.println("musicPlayer1.getName() = " + musicPlayer1.getName());
        System.out.println("musicPlayer2.getName() = " + musicPlayer2.getName());


//        musicPlayer.playMusic();
//
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
