package com.canteen.bean;

public class CanteenAdmin {
    private int managerID;
    private String managerName;
    private String gender;
    private String managerPassword;
    private int canteenID;

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    public int getCanteenID() {
        return canteenID;
    }

    public void setCanteenID(int canteenID) {
        this.canteenID = canteenID;
    }
}
