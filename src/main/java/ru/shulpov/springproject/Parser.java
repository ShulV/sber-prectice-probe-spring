package ru.shulpov.springproject;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

public class Parser {
    public static Document getPage() throws IOException {
        String url = "https://www.cbr.ru/currency_base/daily/";
        return Jsoup.parse(new URL(url), 3000);
    }
}
