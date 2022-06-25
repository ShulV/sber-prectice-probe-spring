package ru.shulpov.springproject;

import org.springframework.stereotype.Component;

@Component("rockMusicBean")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "rock";
    }

    private void myInitMethod() {
        System.out.println("test: call myInitMethod()");
    }

    private void myDestroyMethod() {
        System.out.println("test: call myDestroyMethod()");
    }
}
