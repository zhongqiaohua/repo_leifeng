package com.example.leifeng.models;
public class Discountinfo {
    private Integer shCode;

    private Integer devType;

    private String shUserId;

    private String discountTimeStart;

    private String discountTimeEnd;

    private Integer discountNumber;

    private String network;

    private Integer id;

    public Integer getShCode() {
        return shCode;
    }

    public void setShCode(Integer shCode) {
        this.shCode = shCode;
    }

    public Integer getDevType() {
        return devType;
    }

    public void setDevType(Integer devType) {
        this.devType = devType;
    }

    public String getShUserId() {
        return shUserId;
    }

    public void setShUserId(String shUserId) {
        this.shUserId = shUserId == null ? null : shUserId.trim();
    }

    public String getDiscountTimeStart() {
        return discountTimeStart;
    }

    public void setDiscountTimeStart(String discountTimeStart) {
        this.discountTimeStart = discountTimeStart == null ? null : discountTimeStart.trim();
    }

    public String getDiscountTimeEnd() {
        return discountTimeEnd;
    }

    public void setDiscountTimeEnd(String discountTimeEnd) {
        this.discountTimeEnd = discountTimeEnd == null ? null : discountTimeEnd.trim();
    }

    public Integer getDiscountNumber() {
        return discountNumber;
    }

    public void setDiscountNumber(Integer discountNumber) {
        this.discountNumber = discountNumber;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network == null ? null : network.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}