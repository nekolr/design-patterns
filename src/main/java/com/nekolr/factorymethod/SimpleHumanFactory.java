package com.nekolr.factorymethod;

/**
 * 简单工厂模式
 */
public class SimpleHumanFactory {

    public static  <T extends Human> Human createHuman(Class<T> clazz) {
        Human human = null;
        try {
            human = (Human) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return human;
    }
}
