package com.nekolr.factorymethod;

import java.util.HashMap;
import java.util.Map;

public class LazyInitializationHumanFactory {

    private static final Map<String, Human> humanCache = new HashMap<>();

    public static synchronized Human createHuman(String type) {
        Human human = null;
        if (humanCache.containsKey(type)) {
            human = humanCache.get(type);
        } else {
            if ("yellowHuman".equals(type)) {
                human = new YellowHuman();
            } else if ("blackHuman".equals(type)) {
                human = new BlackHuman();
            } else if ("whiteHuman".equals(type)) {
                human = new WhiteHuman();
            }
            humanCache.put(type, human);
        }
        return human;
    }

}
