package com.amaljoyc.patterns.structural.decorator;

/**
 * Created by amaljoyc on 24.07.18.
 */
public class AuthorizedWebPage extends WebPageDecorator {

    public AuthorizedWebPage(WebPage webPage) {
        super(webPage);
    }

    public void authorize() {
        System.out.println("authorizing");
    }

    @Override
    public void display() {
        super.display();
        this.authorize();
    }
}
