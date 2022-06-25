package ru.shulpov.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("computerBean")
public class Computer {
    private int id;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer" + id + musicPlayer.playMusic();
    }

    private MusicPlayer musicPlayer;


}
