package ru.shulpov.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    private List<Music> musicList;

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

    public String playMusic() {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);
        System.out.println(this.musicList.get(randomNumber).getSong().get(0));

        return "";

    }
}
