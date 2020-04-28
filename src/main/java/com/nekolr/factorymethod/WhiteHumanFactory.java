package com.nekolr.factorymethod;

public class WhiteHumanFactory implements HumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
