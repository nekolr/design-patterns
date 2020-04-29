package com.nekolr.abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("paint a windows button.");
    }
}
