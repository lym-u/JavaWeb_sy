package com.canteen.bean;

import java.io.Serializable;

public class Canteen implements Serializable {
    private int id; // 编号
    private String name; // 食堂名称
    private String location; // 食堂位置
    private String establishedTime; // 建立时间
    private String businessHours; // 营业时间
    private String introduction; // 食堂简介

    public Canteen(int id, String name, String location, String establishedTime, String businessHours, String introduction) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.establishedTime = establishedTime;
        this.businessHours = businessHours;
        this.introduction = introduction;
    }

    // getter 和 setter 方法
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getEstablishedTime() { return establishedTime; }
    public void setEstablishedTime(String establishedTime) { this.establishedTime = establishedTime; }

    public String getBusinessHours() { return businessHours; }
    public void setBusinessHours(String businessHours) { this.businessHours = businessHours; }

    public String getIntroduction() { return introduction; }
    public void setIntroduction(String introduction) { this.introduction = introduction; }

    @Override
    public String toString() {
        return "Canteen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", establishedTime='" + establishedTime + '\'' +
                ", businessHours='" + businessHours + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}

