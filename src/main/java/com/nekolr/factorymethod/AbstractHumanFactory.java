package com.nekolr.factorymethod;

public abstract class AbstractHumanFactory {
    abstract <T extends Human> Human createHuman(Class<T> clazz);
}
