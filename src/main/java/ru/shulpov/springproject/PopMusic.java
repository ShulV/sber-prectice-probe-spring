package ru.shulpov.springproject;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class PopMusic implements Music{
    public PopMusic() {
        this.songList.add("pop1");
        this.songList.add("pop2");
        this.songList.add("pop3");
    }

    private List<String> songList = new ArrayList<String>();
    @Override
    public List<String> getSong() {
        return songList;
    }
}
