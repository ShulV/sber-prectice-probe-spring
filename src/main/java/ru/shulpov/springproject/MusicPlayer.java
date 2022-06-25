package ru.shulpov.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Autowired
    public MusicPlayer(@Qualifier("rockMusicBean") Music music1, @Qualifier("rapMusicBean") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    private Music music1;
    private Music music2;

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

    private String name;
    private int volume;

    public MusicPlayer() {

    }

    public String playMusic(MusicGenre genre) {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);
        if (genre == MusicGenre.RAP) {
            System.out.println(music1.getSong().get(randomNumber));
        } else if (genre == MusicGenre.ROCK) {
            System.out.println(music2.getSong().get(randomNumber));
        }

        return "Playing: " + music1.getSong().get(randomNumber) + ", " + music2.getSong();

    }
}
