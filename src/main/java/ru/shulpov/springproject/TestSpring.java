package ru.shulpov.springproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestSpring {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(MusicGenre.RAP);
        musicPlayer.playMusic(MusicGenre.ROCK);

        context.close();
    }
}
