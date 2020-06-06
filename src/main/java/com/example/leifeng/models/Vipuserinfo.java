package com.example.leifeng.models;

public class Vipuserinfo {
    private Integer id;

    private String userid;

    private String username;

    private String openid;

    private String password;

    private String email;

    private Integer account;

    private Integer serialno;

    private String isvip;

    private String paytime;

    private Integer allchargemoney;

    private String updateuseridsms;

    private String updateuseridsmstime;

    private Integer updateuserid;

    private String registertime;

    private Integer paydeviceid;

    private String perms;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public Integer getSerialno() {
        return serialno;
    }

    public void setSerialno(Integer serialno) {
        this.serialno = serialno;
    }

    public String getIsvip() {
        return isvip;
    }

    public void setIsvip(String isvip) {
        this.isvip = isvip == null ? null : isvip.trim();
    }

    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime == null ? null : paytime.trim();
    }

    public Integer getAllchargemoney() {
        return allchargemoney;
    }

    public void setAllchargemoney(Integer allchargemoney) {
        this.allchargemoney = allchargemoney;
    }

    public String getUpdateuseridsms() {
        return updateuseridsms;
    }

    public void setUpdateuseridsms(String updateuseridsms) {
        this.updateuseridsms = updateuseridsms == null ? null : updateuseridsms.trim();
    }

    public String getUpdateuseridsmstime() {
        return updateuseridsmstime;
    }

    public void setUpdateuseridsmstime(String updateuseridsmstime) {
        this.updateuseridsmstime = updateuseridsmstime == null ? null : updateuseridsmstime.trim();
    }

    public Integer getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(Integer updateuserid) {
        this.updateuserid = updateuserid;
    }

    public String getRegistertime() {
        return registertime;
    }

    public void setRegistertime(String registertime) {
        this.registertime = registertime == null ? null : registertime.trim();
    }

    public Integer getPaydeviceid() {
        return paydeviceid;
    }

    public void setPaydeviceid(Integer paydeviceid) {
        this.paydeviceid = paydeviceid;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms == null ? null : perms.trim();
    }
}