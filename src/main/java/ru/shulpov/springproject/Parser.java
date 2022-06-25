package ru.shulpov.springproject;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class Parser {
    private Document page;
    private List<String> titles; //заголовки данных валюты
    private List<Currency> currencies; //коллекция данных по каждой валюте

    private void readPage() throws IOException {
        String url = "https://www.cbr.ru/currency_base/daily/";
        page = Jsoup.parse(new URL(url), 3000);
    }

    private void extractData() {
        Element currencyTable = this.page.select("table[class=data]").first();
        Elements titleElements = currencyTable.select("th");

        titles = new ArrayList<String>();
        for(Element title: titleElements) {
            titles.add(title.text());
        }

        Elements currencyElements = currencyTable.select("tr");

        for(Element currency: currencyElements) {
            Elements currencyFields = currency.select("td");
            System.out.println(currencyFields.textNodes());
            System.out.println("-------------------------------------");
//            System.out.println(currencyFields.);
//            currencies.add(
//                    new Currency(
//                            parseInt(currencyFields),
//                            currencyFields.get(1).text(),
//                            parseInt(currencyFields.get(2).text()),
//                            currencyFields.get(3).text(),
//                            parseFloat(currencyFields.get(4).text())
//                    )
//            );
        }
    }
    private void printData() {
        for(String title: this.titles) {
            System.out.println(title);
        }
//        for(Currency currency: this.currencies) {
//            System.out.println(currency.digitalCode);
//            System.out.println(currency.letterCode);
//            System.out.println(currency.unitNumber);
//            System.out.println(currency.currency);
//            System.out.println(currency.course);
//        }
    }
    public void parse() throws IOException {
        this.readPage();
        this.extractData();
        this.printData();

    }
}
