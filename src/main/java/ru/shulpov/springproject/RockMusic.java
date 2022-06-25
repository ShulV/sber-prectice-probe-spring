package ru.shulpov.springproject;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component("rockMusicBean")
public class RockMusic implements Music{
    public RockMusic() {
        this.songList.add("rock1");
        this.songList.add("rock2");
        this.songList.add("rock3");
    }

    private ArrayList<String> songList = new ArrayList<String>();
    @Override
    public List<String> getSong() {
        return songList;
    }

}
