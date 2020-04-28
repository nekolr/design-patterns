package com.nekolr.factorymethod;

public class BlackHumanFactory implements HumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
