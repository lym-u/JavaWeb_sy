package com.canteen.bean;

import java.io.Serializable;

public class Dishes implements Serializable {
    private int id; // 编号
    private String name; // 菜名
    private double price; // 原价
    private double salePrice; // 促销价
    private String category; // 菜系
    private int canteenId; // 所属食堂 ID
    private String description; // 菜品描述
    private boolean recommended; // 是否为推荐菜品

    public Dishes(int id, String name, double price, double salePrice, String category, int canteenId, String description, boolean recommended) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.salePrice = salePrice;
        this.category = category;
        this.canteenId = canteenId;
        this.description = description;
        this.recommended = recommended;
    }

    // getter 和 setter 方法
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getSalePrice() { return salePrice; }
    public void setSalePrice(double salePrice) { this.salePrice = salePrice; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public int getCanteenId() { return canteenId; }
    public void setCanteenId(int canteenId) { this.canteenId = canteenId; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public boolean isRecommended() { return recommended; }
    public void setRecommended(boolean recommended) { this.recommended = recommended; }

    @Override
    public String toString() {
        return "Dishes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", salePrice=" + salePrice +
                ", category='" + category + '\'' +
                ", canteenId=" + canteenId +
                ", description='" + description + '\'' +
                ", recommended=" + recommended +
                '}';
    }
}

