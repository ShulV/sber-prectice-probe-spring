package ru.shulpov.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    public MusicPlayer(RapMusic rapMusic, RockMusic rockMusic) {
        this.rapMusic = rapMusic;
        this.rockMusic = rockMusic;
    }

    private RapMusic rapMusic;
    private RockMusic rockMusic;

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

    public String playMusic() {
        return "Playing: " + rapMusic.getSong() + "\nPlaying: " + rockMusic.getSong();

    }
}
