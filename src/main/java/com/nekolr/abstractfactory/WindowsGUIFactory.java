package com.nekolr.abstractfactory;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Radio createRadio() {
        return new WindowsRadio();
    }
}
