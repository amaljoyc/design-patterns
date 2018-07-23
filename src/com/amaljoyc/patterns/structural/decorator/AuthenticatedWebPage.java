package com.amaljoyc.patterns.structural.decorator;

/**
 * Created by amaljoyc on 24.07.18.
 */
public class AuthenticatedWebPage extends WebPageDecorator {

    public AuthenticatedWebPage(WebPage webPage) {
        super(webPage);
    }

    void authenticate() {
        System.out.println("authenticating");
    }

    @Override
    public void display() {
        super.display();
        this.authenticate();
    }
}
