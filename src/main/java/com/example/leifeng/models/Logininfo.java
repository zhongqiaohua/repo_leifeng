package com.example.leifeng.models;
public class Logininfo {
    private Integer id;

    private String openid;

    private String shUserId;

    private Integer userLevel;

    private String shuseridList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getShUserId() {
        return shUserId;
    }

    public void setShUserId(String shUserId) {
        this.shUserId = shUserId == null ? null : shUserId.trim();
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public String getShuseridList() {
        return shuseridList;
    }

    public void setShuseridList(String shuseridList) {
        this.shuseridList = shuseridList == null ? null : shuseridList.trim();
    }
}