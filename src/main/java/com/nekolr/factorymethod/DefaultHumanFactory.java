package com.nekolr.factorymethod;

public class DefaultHumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> Human createHuman(Class<T> clazz) {
        Human human = null;
        try {
            human = (Human) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return human;
    }
}
