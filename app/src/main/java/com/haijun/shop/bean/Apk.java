package com.haijun.shop.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2016/8/2.
 */
public class Apk extends BmobObject {
    private String apkUrl;
    private String versionCode;
    private boolean isUpdateWhenOpen;
    private boolean isForceWhenUpdate;
    private String qqContactInfo;
    private String weixinContactInfo;
    private String weixinGZHContactInfo;
    private String qrCode;
    private String contactPhone;
    private String platform;
    private String updateDescription ;
    private boolean isuploadApkTest;

    public String getApkUrl() {
        return apkUrl;
    }

    public void setApkUrl(String apkUrl) {
        this.apkUrl = apkUrl;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }


    public boolean isUpdateWhenOpen() {
        return isUpdateWhenOpen;
    }

    public void setUpdateWhenOpen(boolean updateWhenOpen) {
        isUpdateWhenOpen = updateWhenOpen;
    }

    public boolean isForceWhenUpdate() {
        return isForceWhenUpdate;
    }

    public void setForceWhenUpdate(boolean forceWhenUpdate) {
        isForceWhenUpdate = forceWhenUpdate;
    }

    public String getQqContactInfo() {
        return qqContactInfo;
    }

    public void setQqContactInfo(String qqContactInfo) {
        this.qqContactInfo = qqContactInfo;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getWeixinContactInfo() {
        return weixinContactInfo;
    }

    public void setWeixinContactInfo(String weixinContactInfo) {
        this.weixinContactInfo = weixinContactInfo;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getWeixinGZHContactInfo() {
        return weixinGZHContactInfo;
    }

    public void setWeixinGZHContactInfo(String weixinGZHContactInfo) {
        this.weixinGZHContactInfo = weixinGZHContactInfo;
    }

    public boolean isIsuploadApkTest() {
        return isuploadApkTest;
    }

    public void setIsuploadApkTest(boolean isuploadApkTest) {
        this.isuploadApkTest = isuploadApkTest;
    }

    public String getUpdateDescription() {
        return updateDescription;
    }

    public void setUpdateDescription(String updateDescription) {
        this.updateDescription = updateDescription;
    }

    @Override
    public String toString() {
        return "Apk{" +
                "apkUrl='" + apkUrl + '\'' +
                ", versionCode='" + versionCode + '\'' +
                ", isUpdateWhenOpen=" + isUpdateWhenOpen +
                ", isForceWhenUpdate=" + isForceWhenUpdate +
                ", qqContactInfo='" + qqContactInfo + '\'' +
                ", weixinContactInfo='" + weixinContactInfo + '\'' +
                ", weixinGZHContactInfo='" + weixinGZHContactInfo + '\'' +
                ", qrCode='" + qrCode + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", platform='" + platform + '\'' +
                ", isuploadApkTest=" + isuploadApkTest +
                '}';
    }

    public Apk() {
    }

    public Apk(String apkUrl, String versionCode, boolean isUpdateWhenOpen, boolean isForceWhenUpdate, String qqContactInfo, String weixinContactInfo, String weixinGZHContactInfo, String qrCode, String contactPhone, String platform, boolean isuploadApkTest) {
        this.apkUrl = apkUrl;
        this.versionCode = versionCode;
        this.isUpdateWhenOpen = isUpdateWhenOpen;
        this.isForceWhenUpdate = isForceWhenUpdate;
        this.qqContactInfo = qqContactInfo;
        this.weixinContactInfo = weixinContactInfo;
        this.weixinGZHContactInfo = weixinGZHContactInfo;
        this.qrCode = qrCode;
        this.contactPhone = contactPhone;
        this.platform = platform;
        this.isuploadApkTest = isuploadApkTest;
    }
}
