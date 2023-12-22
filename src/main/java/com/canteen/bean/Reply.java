package com.canteen.bean;

import java.io.Serializable;

public class Reply implements Serializable {
    private int replyId; // 回复ID
    private int reviewId; // 评价ID
    private int userId; // 用户ID
    private String content; // 回复内容
    private String replyTime; // 回复时间

    public Reply(int replyId, int reviewId, int userId, String content, String replyTime) {
        this.replyId = replyId;
        this.reviewId = reviewId;
        this.userId = userId;
        this.content = content;
        this.replyTime = replyTime;
    }

    // getter 和 setter 方法
    public int getReplyId() { return replyId; }
    public void setReplyId(int replyId) { this.replyId = replyId; }

    public int getReviewId() { return reviewId; }
    public void setReviewId(int reviewId) { this.reviewId = reviewId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getReplyTime() { return replyTime; }
    public void setReplyTime(String replyTime) { this.replyTime = replyTime; }

    @Override
    public String toString() {
        return "Reply{" +
                "replyId=" + replyId +
                ", reviewId=" + reviewId +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                ", replyTime='" + replyTime + '\'' +
                '}';
    }
}

