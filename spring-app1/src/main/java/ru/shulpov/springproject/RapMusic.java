package ru.shulpov.springproject;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music{
    public RapMusic() {
        this.songList.add("rap1");
        this.songList.add("rap2");
        this.songList.add("rap3");
    }

    private List<String> songList = new ArrayList<String>();
    @Override
    public List<String> getSong() {
        return songList;
    }
}
