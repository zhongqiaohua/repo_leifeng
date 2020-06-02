package com.example.leifeng.models;
public class Priceinfo {
    private Integer id;
//    网点id -自动生成
    private Integer shCode;

    private Integer devType;

    private String shUserId;
//所属商户 -只能选择已存在商户
    private String network;
//网点名称
    private Integer finishMinPower;
//结束功率 -初始值40
    private Integer fees250w;
//小功率充电时间 -初始值150
    private Integer fees350w;
//中功率充电时间 -初始值120
    private Integer fees600w;
//大功率充电时间 -初始值60
    private Integer feesDc;
//DC充电时间  -初始值120
    private Integer maxChargeTime;
//最大充电时间 -默认值720
    private Integer canUse;
//是否禁用
    private Integer paymoneyFenPertimeNotvip;
//普通用户扣费金额（分）
    private Integer paymoneyFenPertimeVip;
//VIP用户扣费金额（分）
    private Integer finishTime;
//浮充时间 -初始值60
    private Integer giveupTime;
//检查间隔时间 -默认值30
    private Integer overloadPower;
//AC最大允许充电功率 -默认值650
    private Integer freeCharge;
//是否为免费网点 -初始值否
    private String deviceProvinceAddress;
//省  -初始值 广东省
    private String deviceCityAddress;
//市  -初始值 深圳市
    private String deviceAreaAddress;
//区  -初始值 宝安区
    private String deviceDetailAddress;
//详细地址
    private Integer maxChargeTimeDc;
//DC最大充电时间 -默认值600
    private Integer power1250w;
//小功率标准 -初始值150
    private Integer power2350w;
//中功率标准 -初始值280
    private Integer power3600w;
//大功率标准 -初始值500
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network == null ? null : network.trim();
    }

    public Integer getFinishMinPower() {
        return finishMinPower;
    }

    public void setFinishMinPower(Integer finishMinPower) {
        this.finishMinPower = finishMinPower;
    }

    public Integer getFees250w() {
        return fees250w;
    }

    public void setFees250w(Integer fees250w) {
        this.fees250w = fees250w;
    }

    public Integer getFees350w() {
        return fees350w;
    }

    public void setFees350w(Integer fees350w) {
        this.fees350w = fees350w;
    }

    public Integer getFees600w() {
        return fees600w;
    }

    public void setFees600w(Integer fees600w) {
        this.fees600w = fees600w;
    }

    public Integer getFeesDc() {
        return feesDc;
    }

    public void setFeesDc(Integer feesDc) {
        this.feesDc = feesDc;
    }

    public Integer getMaxChargeTime() {
        return maxChargeTime;
    }

    public void setMaxChargeTime(Integer maxChargeTime) {
        this.maxChargeTime = maxChargeTime;
    }

    public Integer getCanUse() {
        return canUse;
    }

    public void setCanUse(Integer canUse) {
        this.canUse = canUse;
    }

    public Integer getPaymoneyFenPertimeNotvip() {
        return paymoneyFenPertimeNotvip;
    }

    public void setPaymoneyFenPertimeNotvip(Integer paymoneyFenPertimeNotvip) {
        this.paymoneyFenPertimeNotvip = paymoneyFenPertimeNotvip;
    }

    public Integer getPaymoneyFenPertimeVip() {
        return paymoneyFenPertimeVip;
    }

    public void setPaymoneyFenPertimeVip(Integer paymoneyFenPertimeVip) {
        this.paymoneyFenPertimeVip = paymoneyFenPertimeVip;
    }

    public Integer getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Integer finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getGiveupTime() {
        return giveupTime;
    }

    public void setGiveupTime(Integer giveupTime) {
        this.giveupTime = giveupTime;
    }

    public Integer getOverloadPower() {
        return overloadPower;
    }

    public void setOverloadPower(Integer overloadPower) {
        this.overloadPower = overloadPower;
    }

    public Integer getFreeCharge() {
        return freeCharge;
    }

    public void setFreeCharge(Integer freeCharge) {
        this.freeCharge = freeCharge;
    }

    public String getDeviceProvinceAddress() {
        return deviceProvinceAddress;
    }

    public void setDeviceProvinceAddress(String deviceProvinceAddress) {
        this.deviceProvinceAddress = deviceProvinceAddress == null ? null : deviceProvinceAddress.trim();
    }

    public String getDeviceCityAddress() {
        return deviceCityAddress;
    }

    public void setDeviceCityAddress(String deviceCityAddress) {
        this.deviceCityAddress = deviceCityAddress == null ? null : deviceCityAddress.trim();
    }

    public String getDeviceAreaAddress() {
        return deviceAreaAddress;
    }

    public void setDeviceAreaAddress(String deviceAreaAddress) {
        this.deviceAreaAddress = deviceAreaAddress == null ? null : deviceAreaAddress.trim();
    }

    public String getDeviceDetailAddress() {
        return deviceDetailAddress;
    }

    public void setDeviceDetailAddress(String deviceDetailAddress) {
        this.deviceDetailAddress = deviceDetailAddress == null ? null : deviceDetailAddress.trim();
    }

    public Integer getMaxChargeTimeDc() {
        return maxChargeTimeDc;
    }

    public void setMaxChargeTimeDc(Integer maxChargeTimeDc) {
        this.maxChargeTimeDc = maxChargeTimeDc;
    }

    public Integer getPower1250w() {
        return power1250w;
    }

    public void setPower1250w(Integer power1250w) {
        this.power1250w = power1250w;
    }

    public Integer getPower2350w() {
        return power2350w;
    }

    public void setPower2350w(Integer power2350w) {
        this.power2350w = power2350w;
    }

    public Integer getPower3600w() {
        return power3600w;
    }

    public void setPower3600w(Integer power3600w) {
        this.power3600w = power3600w;
    }
}