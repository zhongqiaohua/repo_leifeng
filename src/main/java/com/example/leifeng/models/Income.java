package com.example.leifeng.models;

import java.math.BigDecimal;
import java.util.Date;
public class Income {
    private Integer id;

    private String shUserId;

    private String istransfer;

    private BigDecimal allIncome;

    private BigDecimal thisMonthIncome;

    private BigDecimal lastMonthIncome;

    private BigDecimal todayIncome;

    private Integer rate;

    private BigDecimal transfer;

    private BigDecimal withdrawable;

    private BigDecimal handlingFee;

    private Integer requestWithdraw;

    private String requestWithdrawTime;

    private Date updateincometime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShUserId() {
        return shUserId;
    }

    public void setShUserId(String shUserId) {
        this.shUserId = shUserId == null ? null : shUserId.trim();
    }

    public String getIstransfer() {
        return istransfer;
    }

    public void setIstransfer(String istransfer) {
        this.istransfer = istransfer == null ? null : istransfer.trim();
    }

    public BigDecimal getAllIncome() {
        return allIncome;
    }

    public void setAllIncome(BigDecimal allIncome) {
        this.allIncome = allIncome;
    }

    public BigDecimal getThisMonthIncome() {
        return thisMonthIncome;
    }

    public void setThisMonthIncome(BigDecimal thisMonthIncome) {
        this.thisMonthIncome = thisMonthIncome;
    }

    public BigDecimal getLastMonthIncome() {
        return lastMonthIncome;
    }

    public void setLastMonthIncome(BigDecimal lastMonthIncome) {
        this.lastMonthIncome = lastMonthIncome;
    }

    public BigDecimal getTodayIncome() {
        return todayIncome;
    }

    public void setTodayIncome(BigDecimal todayIncome) {
        this.todayIncome = todayIncome;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public BigDecimal getTransfer() {
        return transfer;
    }

    public void setTransfer(BigDecimal transfer) {
        this.transfer = transfer;
    }

    public BigDecimal getWithdrawable() {
        return withdrawable;
    }

    public void setWithdrawable(BigDecimal withdrawable) {
        this.withdrawable = withdrawable;
    }

    public BigDecimal getHandlingFee() {
        return handlingFee;
    }

    public void setHandlingFee(BigDecimal handlingFee) {
        this.handlingFee = handlingFee;
    }

    public Integer getRequestWithdraw() {
        return requestWithdraw;
    }

    public void setRequestWithdraw(Integer requestWithdraw) {
        this.requestWithdraw = requestWithdraw;
    }

    public String getRequestWithdrawTime() {
        return requestWithdrawTime;
    }

    public void setRequestWithdrawTime(String requestWithdrawTime) {
        this.requestWithdrawTime = requestWithdrawTime == null ? null : requestWithdrawTime.trim();
    }

    public Date getUpdateincometime() {
        return updateincometime;
    }

    public void setUpdateincometime(Date updateincometime) {
        this.updateincometime = updateincometime;
    }
}