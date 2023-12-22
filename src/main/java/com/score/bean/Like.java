package com.score.bean;

import java.io.Serializable;

public class Like implements Serializable {
    private int likeId; // 点赞ID
    private int reviewId; // 评价ID
    private int userId; // 用户ID

    public Like(int likeId, int reviewId, int userId) {
        this.likeId = likeId;
        this.reviewId = reviewId;
        this.userId = userId;
    }

    // getter 和 setter 方法
    public int getLikeId() { return likeId; }
    public void setLikeId(int likeId) { this.likeId = likeId; }

    public int getReviewId() { return reviewId; }
    public void setReviewId(int reviewId) { this.reviewId = reviewId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    @Override
    public String toString() {
        return "Like{" +
                "likeId=" + likeId +
                ", reviewId=" + reviewId +
                ", userId=" + userId +
                '}';
    }
}

