package com.icbc.entity;

//水果类
public class Fruit {
    private String name; // 水果名称
    private float pricePerJin; // 每斤价格

    public Fruit(String name, float pricePerJin) {
        this.name = name;
        this.pricePerJin = pricePerJin;
    }

    public double getPricePerJin() {
        return pricePerJin;
    }

    public String getName() {
        return name;
    }
}
