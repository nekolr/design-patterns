package com.nekolr.abstractfactory;

public class MacOSGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Radio createRadio() {
        return new MacOSRadio();
    }
}
