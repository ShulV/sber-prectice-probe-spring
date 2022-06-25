package ru.shulpov.springproject;

import org.springframework.stereotype.Component;

@Component("rapMusicBean")
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "rap";
    }
}
