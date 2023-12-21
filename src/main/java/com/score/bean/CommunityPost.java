package com.score.bean;

import java.io.Serializable;
import java.util.Date;

public class CommunityPost implements Serializable {
    private int id;
    private int userId;
    private String title;
    private String content;
    private String imageUrl;
    private Date postTime;

    public CommunityPost() {
        // 默认构造函数
    }

    public CommunityPost(int id, int userId, String title,
                         String content, String imageUrl, Date postTime) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.imageUrl = imageUrl;
        this.postTime = postTime;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }
}

