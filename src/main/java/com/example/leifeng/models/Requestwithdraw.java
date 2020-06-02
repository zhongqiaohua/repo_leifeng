package com.example.leifeng.models;
public class Requestwithdraw {
    private Integer id;

    private String tradeNo;

    private String shUserId;

    private Integer withdraw;

    private String datetime;

    private Integer handlingFee;

    private Integer adminagree;

    private String agreetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getShUserId() {
        return shUserId;
    }

    public void setShUserId(String shUserId) {
        this.shUserId = shUserId == null ? null : shUserId.trim();
    }

    public Integer getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(Integer withdraw) {
        this.withdraw = withdraw;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime == null ? null : datetime.trim();
    }

    public Integer getHandlingFee() {
        return handlingFee;
    }

    public void setHandlingFee(Integer handlingFee) {
        this.handlingFee = handlingFee;
    }

    public Integer getAdminagree() {
        return adminagree;
    }

    public void setAdminagree(Integer adminagree) {
        this.adminagree = adminagree;
    }

    public String getAgreetime() {
        return agreetime;
    }

    public void setAgreetime(String agreetime) {
        this.agreetime = agreetime == null ? null : agreetime.trim();
    }
}