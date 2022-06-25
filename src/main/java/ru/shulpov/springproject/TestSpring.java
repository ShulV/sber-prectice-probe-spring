package ru.shulpov.springproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestSpring {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );

        Music rapMusic = context.getBean("rapMusicBean", RapMusic.class);

        System.out.println(rapMusic.getSong());

        context.close();
    }
}
