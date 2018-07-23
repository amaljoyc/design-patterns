package com.amaljoyc.patterns.structural.decorator;

/**
 * Created by amaljoyc on 24.07.18.
 */
public abstract class WebPageDecorator implements WebPage {

    WebPage webPage;

    public WebPageDecorator(WebPage webPage) {
        this.webPage = webPage;
    }

    @Override
    public void display() {
        this.webPage.display();
    }
}
