package com.example.leifeng.models;
public class Employeeinfo {
    private Integer id;

    private String employeeUserId;

    private String password;

    private String employeePhone;

    private String employeeCompany;

    private String employeeOpenid;

    private Integer employeeLevel;

    private Integer freeCharge;

    private String sms;

    private String smsTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeUserId() {
        return employeeUserId;
    }

    public void setEmployeeUserId(String employeeUserId) {
        this.employeeUserId = employeeUserId == null ? null : employeeUserId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone == null ? null : employeePhone.trim();
    }

    public String getEmployeeCompany() {
        return employeeCompany;
    }

    public void setEmployeeCompany(String employeeCompany) {
        this.employeeCompany = employeeCompany == null ? null : employeeCompany.trim();
    }

    public String getEmployeeOpenid() {
        return employeeOpenid;
    }

    public void setEmployeeOpenid(String employeeOpenid) {
        this.employeeOpenid = employeeOpenid == null ? null : employeeOpenid.trim();
    }

    public Integer getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(Integer employeeLevel) {
        this.employeeLevel = employeeLevel;
    }

    public Integer getFreeCharge() {
        return freeCharge;
    }

    public void setFreeCharge(Integer freeCharge) {
        this.freeCharge = freeCharge;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms == null ? null : sms.trim();
    }

    public String getSmsTime() {
        return smsTime;
    }

    public void setSmsTime(String smsTime) {
        this.smsTime = smsTime == null ? null : smsTime.trim();
    }

    public Employeeinfo(Integer id, String employeeUserId, String password, String employeePhone, String employeeCompany, String employeeOpenid, Integer employeeLevel, Integer freeCharge, String sms, String smsTime) {
        this.id = id;
        this.employeeUserId = employeeUserId;
        this.password = password;
        this.employeePhone = employeePhone;
        this.employeeCompany = employeeCompany;
        this.employeeOpenid = employeeOpenid;
        this.employeeLevel = employeeLevel;
        this.freeCharge = freeCharge;
        this.sms = sms;
        this.smsTime = smsTime;
    }
    public Employeeinfo(String employeeUserId, String password, String employeePhone, String employeeCompany, Integer employeeLevel, Integer freeCharge) {
        this.employeeUserId = employeeUserId;
        this.password = password;
        this.employeePhone = employeePhone;
        this.employeeCompany = employeeCompany;
        this.employeeLevel = employeeLevel;
        this.freeCharge = freeCharge;
    }
}