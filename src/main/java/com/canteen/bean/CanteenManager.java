package com.canteen.bean;

import java.io.Serializable;

public class CanteenManager implements Serializable {
    private int id;
    private String name;
    private String gender;
    private String password;
    private int canteenId;

    public CanteenManager() {
        // 默认构造函数
    }

    public CanteenManager(int id, String name, String gender, String password, int canteenId) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.password = password;
        this.canteenId = canteenId;
    }

    // getter和setter方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCanteenId() {
        return canteenId;
    }

    public void setCanteenId(int canteenId) {
        this.canteenId = canteenId;
    }
}

