package com.canteen.bean;

import java.io.Serializable;

public class ActivityAnnouncement implements Serializable {
    private int id;
    private int userId;
    private String activityType;
    private String content;

    public ActivityAnnouncement() {
        // 默认构造函数
    }

    public ActivityAnnouncement(int id, int userId, String activityType, String content) {
        this.id = id;
        this.userId = userId;
        this.activityType = activityType;
        this.content = content;
    }

    // getter和setter方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

