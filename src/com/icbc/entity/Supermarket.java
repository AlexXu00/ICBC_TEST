package com.icbc.entity;


// 超市类
public class Supermarket {
    private Fruit apple; // 苹果实例
    private Fruit strawberry; // 草莓实例
    private Fruit mango; // 芒果实例

    public Supermarket() {
        this.apple = new Fruit("苹果", 8.0f);
        this.strawberry = new Fruit("草莓", 13.0f);
        this.mango = new Fruit("芒果", 20.0f);
    }
    
    /**
     * 计算购买水果的总价
     *
     * @param appleWeight      苹果的斤数
     * @param strawberryWeight 草莓的斤数
     * @param mangoWeight      芒果的斤数
     * @param discount         是否应用草莓折扣
     * @param bulkDiscount     是否应用满减优惠
     * @return 总价
     */
    public double calculateTotalPrice(int appleWeight, int strawberryWeight, int mangoWeight, boolean discount, boolean bulkDiscount) {
        // 确保斤数为非负整数
        if (appleWeight < 0 || strawberryWeight < 0 || mangoWeight < 0) {
            throw new IllegalArgumentException("水果斤数必须为非负整数。");
        }

        // 计算草莓的折后价格
        double strawberryPrice = discount ? strawberry.getPricePerJin() * 0.8 : strawberry.getPricePerJin();

        // 计算总价
        double totalPrice = (appleWeight * apple.getPricePerJin()) +
                (strawberryWeight * strawberryPrice) +
                (mangoWeight * mango.getPricePerJin());

        // 满 100 减 10 的促销活动
        if (bulkDiscount && totalPrice >= 100) {
            totalPrice -= 10;
        }

        return totalPrice;
    }


}
