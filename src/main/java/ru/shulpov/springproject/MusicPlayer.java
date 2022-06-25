package ru.shulpov.springproject;

public class MusicPlayer {
    private Music music;

    public void setMusic(Music music) {
        this.music = music;
    }

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {

    }

    public void playMusic() {
        System.out.println("Playing: " + this.music.getSong());
    }
}
