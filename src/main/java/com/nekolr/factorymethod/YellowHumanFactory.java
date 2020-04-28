package com.nekolr.factorymethod;

public class YellowHumanFactory implements HumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
