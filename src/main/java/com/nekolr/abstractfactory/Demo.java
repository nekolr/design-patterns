package com.nekolr.abstractfactory;

public class Demo {

    private static Application configureApplication() {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if ("mac".equals(osName)) {
            factory = new MacOSGUIFactory();
        } else {
            factory = new WindowsGUIFactory();
        }
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
