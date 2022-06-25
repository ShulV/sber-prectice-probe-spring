package ru.shulpov.springproject;

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
