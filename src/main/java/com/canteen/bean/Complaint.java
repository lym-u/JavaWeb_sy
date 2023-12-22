package com.canteen.bean;

import java.io.Serializable;
import java.util.Date;

public class Complaint implements Serializable {
    private int id;
    private int complainerId;
    private int canteenId;
    private String complaintInfo;
    private Date complaintTime;
    private String status;
    private int handlerId;
    private String handleInfo;
    private Date handleTime;

    public Complaint() {
        // 默认构造函数
    }

    public Complaint(int id, int complainerId, int canteenId, String complaintInfo,
                     Date complaintTime, String status, int handlerId, String handleInfo, Date handleTime) {
        this.id = id;
        this.complainerId = complainerId;
        this.canteenId = canteenId;
        this.complaintInfo = complaintInfo;
        this.complaintTime = complaintTime;
        this.status = status;
        this.handlerId = handlerId;
        this.handleInfo = handleInfo;
        this.handleTime = handleTime;
    }

    // getter和setter方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getComplainerId() {
        return complainerId;
    }

    public void setComplainerId(int complainerId) {
        this.complainerId = complainerId;
    }

    public int getCanteenId() {
        return canteenId;
    }

    public void setCanteenId(int canteenId) {
        this.canteenId = canteenId;
    }

    public String getComplaintInfo() {
        return complaintInfo;
    }

    public void setComplaintInfo(String complaintInfo) {
        this.complaintInfo = complaintInfo;
    }

    public Date getComplaintTime() {
        return complaintTime;
    }

    public void setComplaintTime(Date complaintTime) {
        this.complaintTime = complaintTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(int handlerId) {
        this.handlerId = handlerId;
    }

    public String getHandleInfo() {
        return handleInfo;
    }

    public void setHandleInfo(String handleInfo) {
        this.handleInfo = handleInfo;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }
}

