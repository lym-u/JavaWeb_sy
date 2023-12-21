package com.score.bean;

import java.io.Serializable;
import java.util.Date;

public class DishEvaluation implements Serializable {
    private int id;
    private int userId;
    private int dishId;
    private String title;
    private String content;
    private String imageUrl;
    private Date evaluationTime;
    private int score;

    public DishEvaluation() {
        // 默认构造函数
    }

    public DishEvaluation(int id, int userId, int dishId, String title,
                          String content, String imageUrl, Date evaluationTime, int score) {
        this.id = id;
        this.userId = userId;
        this.dishId = dishId;
        this.title = title;
        this.content = content;
        this.imageUrl = imageUrl;
        this.evaluationTime = evaluationTime;
        this.score = score;
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

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
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

    public Date getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

