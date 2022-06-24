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

        System.out.println(Parser.getPage());




        context.close();
    }
}
