package com.icbc;

import com.icbc.entity.Supermarket;

public class Main {
    public static void main(String[] args) {
        // 创建超市实例
        Supermarket supermarket = new Supermarket();

        // 题目1
        int appleWeightA = 3;
        int strawberryWeightA = 2;
        double totalPriceA = supermarket.calculateTotalPrice(appleWeightA, strawberryWeightA, 0, false, false);
        System.out.println("顾客 A 的总价为: " + totalPriceA + " 元");

        // 题目2
        int appleWeightB = 2;
        int strawberryWeightB = 1;
        int mangoWeightB = 3;
        double totalPriceB = supermarket.calculateTotalPrice(appleWeightB, strawberryWeightB, mangoWeightB, false, false);
        System.out.println("顾客 B 的总价为: " + totalPriceB + " 元");

        // 题目3
        int appleWeightC = 1;
        int strawberryWeightC = 2;
        int mangoWeightC = 1;
        double totalPriceC = supermarket.calculateTotalPrice(appleWeightC, strawberryWeightC, mangoWeightC, true, false);
        System.out.println("顾客 C 的总价为: " + totalPriceC + " 元");

        // 题目4
        int appleWeightD = 5;
        int strawberryWeightD = 4;
        int mangoWeightD = 2;
        double totalPriceD = supermarket.calculateTotalPrice(appleWeightD, strawberryWeightD, mangoWeightD, true, true);
        System.out.println("顾客 D 的总价为: " + totalPriceD + " 元");
    }
}
