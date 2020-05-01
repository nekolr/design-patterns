package com.nekolr.builder.pizza;

import java.util.List;

public class Pizza {
    /**
     * 名称
     */
    private String name;
    /**
     * 面饼之上的层
     */
    private List<String> toppings;

    public void setName(String name) {
        this.name = name;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }
}
