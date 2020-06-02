package com.example.leifeng.models;

public class Concurrency {
    private String date;

    private Integer maxusernumber;

    private String maxusertime;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public Integer getMaxusernumber() {
        return maxusernumber;
    }

    public void setMaxusernumber(Integer maxusernumber) {
        this.maxusernumber = maxusernumber;
    }

    public String getMaxusertime() {
        return maxusertime;
    }

    public void setMaxusertime(String maxusertime) {
        this.maxusertime = maxusertime == null ? null : maxusertime.trim();
    }
}