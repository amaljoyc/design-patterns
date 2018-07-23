package com.amaljoyc.patterns.structural.decorator;

/**
 * Created by amaljoyc on 24.07.18.
 */
public class Main {

    public static void main(String[] args) {
        WebPage webPage = new BasicWebPage();
        webPage = new AuthorizedWebPage(webPage);
        webPage = new AuthenticatedWebPage(webPage);
        webPage.display();
    }
}
