package ru.shulpov.springproject;

public class Currency {
    int digitalCode;
    String letterCode;
    int unitNumber;
    String currency;
    Float course;

    public Currency(int digitalCode, String letterCode, int unitNumber, String currency, Float course) {
        this.digitalCode = digitalCode;
        this.letterCode = letterCode;
        this.unitNumber = unitNumber;
        this.currency = currency;
        this.course = course;
    }
}
