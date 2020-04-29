package com.nekolr.abstractfactory;

public class Application {

    private Button button;
    private Radio radio;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        radio = factory.createRadio();
    }

    public void paint() {
        button.paint();
        radio.paint();
    }
}
