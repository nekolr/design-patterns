package com.nekolr.factorymethod;

public class Demo {

    private static Human getHuman(String type) {
        Human human = null;
        if ("yellowHuman".equals(type)) {
            human = new YellowHuman();
        } else if ("blackHuman".equals(type)) {
            human = new BlackHuman();
        } else if ("whiteHuman".equals(type)) {
            human = new WhiteHuman();
        }
        return human;
    }

    public static void main(String[] args) {

        /**
         * 原始的创建对象的方式
         *
         * 可以看到这种方式会造成客户端代码与具体的产品实现类耦合
         * 在增加新的产品时需要修改客户端的代码
         */
        Human yellowHuman = getHuman("yellowHuman");
        yellowHuman.getSkinColor();

        /**
         * 多工厂模式
         */
        HumanFactory blackHumanFactory = new BlackHumanFactory();
        Human blackHuman1 = blackHumanFactory.createHuman();
        blackHuman1.getSkinColor();

        HumanFactory yellowHumanFactory = new YellowHumanFactory();
        Human yellowHuman1 = yellowHumanFactory.createHuman();
        yellowHuman1.getSkinColor();

        WhiteHumanFactory whiteHumanFactory = new WhiteHumanFactory();
        Human whiteHuman1 = whiteHumanFactory.createHuman();
        whiteHuman1.getSkinColor();

        /**
         * 优化版的工厂方法模式
         */
        AbstractHumanFactory humanFactory = new DefaultHumanFactory();
        Human blackHuman2 = humanFactory.createHuman(BlackHuman.class);
        blackHuman2.getSkinColor();

        Human yellowHuman2 = humanFactory.createHuman(YellowHuman.class);
        yellowHuman2.getSkinColor();

        Human whiteHuman2 = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman2.getSkinColor();

        /**
         * 简单工厂模式
         */
        Human blackHuman3 = SimpleHumanFactory.createHuman(BlackHuman.class);
        blackHuman3.getSkinColor();

        Human yellowHuman3 = SimpleHumanFactory.createHuman(YellowHuman.class);
        yellowHuman3.getSkinColor();

        Human whiteHuman3 = SimpleHumanFactory.createHuman(WhiteHuman.class);
        whiteHuman3.getSkinColor();

    }
}
