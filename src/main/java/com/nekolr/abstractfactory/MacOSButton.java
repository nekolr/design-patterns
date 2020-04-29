package com.nekolr.abstractfactory;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("paint a macOS button.");
    }
}
