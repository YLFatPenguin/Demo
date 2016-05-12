/*
 * TeamUsers.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-01 Created
 */
package com.info.entity;

import java.util.Date;

public class TeamUsers {

    private Integer id;
    private Integer groupid;
    private Byte isadmin;
    private Byte isgroupmanager;
    private Byte issales;
    private Integer titleid;
    private Date joindate;
    private Date leavedate;
    private String name;
    private String loginname;
    private String password;
    private String tel;
    private String mobile;
    private String imnumber;
    private String email;
    private String address;
    private Date birthdate;
    private String photo;
    private String memo;
    private Byte schedulerworktime;
    private Byte enabled;
    private Double orderprice;
    private Integer orderamount;
    private String permissionvalue;
    private String permissionid;
    private String permissioninherit;
    private Byte chartbyyear;
    private String skin;
    private Integer customerlimit;
    private Byte usbkey;
    private String usbkeysn;
    private Integer homepage;
    private String attachment;
    private String alpha;
    private String spell;
    private String thumbbase64;
    private String managegroups;
    private String manageusers;
    private Date lastaccesstime;
    private Byte appenabled;
    private String modulesetting;
    private String uuid;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getGroupid() {
        return groupid;
    }
    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }
    public Byte getIsadmin() {
        return isadmin;
    }
    public void setIsadmin(Byte isadmin) {
        this.isadmin = isadmin;
    }
    public Byte getIsgroupmanager() {
        return isgroupmanager;
    }
    public void setIsgroupmanager(Byte isgroupmanager) {
        this.isgroupmanager = isgroupmanager;
    }
    public Byte getIssales() {
        return issales;
    }
    public void setIssales(Byte issales) {
        this.issales = issales;
    }
    public Integer getTitleid() {
        return titleid;
    }
    public void setTitleid(Integer titleid) {
        this.titleid = titleid;
    }
    public Date getJoindate() {
        return joindate;
    }
    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }
    public Date getLeavedate() {
        return leavedate;
    }
    public void setLeavedate(Date leavedate) {
        this.leavedate = leavedate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getLoginname() {
        return loginname;
    }
    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }
    public String getImnumber() {
        return imnumber;
    }
    public void setImnumber(String imnumber) {
        this.imnumber = imnumber == null ? null : imnumber.trim();
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
    public Date getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
    public Byte getSchedulerworktime() {
        return schedulerworktime;
    }
    public void setSchedulerworktime(Byte schedulerworktime) {
        this.schedulerworktime = schedulerworktime;
    }
    public Byte getEnabled() {
        return enabled;
    }
    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }
    public Double getOrderprice() {
        return orderprice;
    }
    public void setOrderprice(Double orderprice) {
        this.orderprice = orderprice;
    }
    public Integer getOrderamount() {
        return orderamount;
    }
    public void setOrderamount(Integer orderamount) {
        this.orderamount = orderamount;
    }
    public String getPermissionvalue() {
        return permissionvalue;
    }
    public void setPermissionvalue(String permissionvalue) {
        this.permissionvalue = permissionvalue == null ? null : permissionvalue.trim();
    }
    public String getPermissionid() {
        return permissionid;
    }
    public void setPermissionid(String permissionid) {
        this.permissionid = permissionid == null ? null : permissionid.trim();
    }
    public String getPermissioninherit() {
        return permissioninherit;
    }
    public void setPermissioninherit(String permissioninherit) {
        this.permissioninherit = permissioninherit == null ? null : permissioninherit.trim();
    }
    public Byte getChartbyyear() {
        return chartbyyear;
    }
    public void setChartbyyear(Byte chartbyyear) {
        this.chartbyyear = chartbyyear;
    }
    public String getSkin() {
        return skin;
    }
    public void setSkin(String skin) {
        this.skin = skin == null ? null : skin.trim();
    }
    public Integer getCustomerlimit() {
        return customerlimit;
    }
    public void setCustomerlimit(Integer customerlimit) {
        this.customerlimit = customerlimit;
    }
    public Byte getUsbkey() {
        return usbkey;
    }
    public void setUsbkey(Byte usbkey) {
        this.usbkey = usbkey;
    }
    public String getUsbkeysn() {
        return usbkeysn;
    }
    public void setUsbkeysn(String usbkeysn) {
        this.usbkeysn = usbkeysn == null ? null : usbkeysn.trim();
    }
    public Integer getHomepage() {
        return homepage;
    }
    public void setHomepage(Integer homepage) {
        this.homepage = homepage;
    }
    public String getAttachment() {
        return attachment;
    }
    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }
    public String getAlpha() {
        return alpha;
    }
    public void setAlpha(String alpha) {
        this.alpha = alpha == null ? null : alpha.trim();
    }
    public String getSpell() {
        return spell;
    }
    public void setSpell(String spell) {
        this.spell = spell == null ? null : spell.trim();
    }
    public String getThumbbase64() {
        return thumbbase64;
    }
    public void setThumbbase64(String thumbbase64) {
        this.thumbbase64 = thumbbase64 == null ? null : thumbbase64.trim();
    }
    public String getManagegroups() {
        return managegroups;
    }
    public void setManagegroups(String managegroups) {
        this.managegroups = managegroups == null ? null : managegroups.trim();
    }
    public String getManageusers() {
        return manageusers;
    }
    public void setManageusers(String manageusers) {
        this.manageusers = manageusers == null ? null : manageusers.trim();
    }
    public Date getLastaccesstime() {
        return lastaccesstime;
    }
    public void setLastaccesstime(Date lastaccesstime) {
        this.lastaccesstime = lastaccesstime;
    }
    public Byte getAppenabled() {
        return appenabled;
    }
    public void setAppenabled(Byte appenabled) {
        this.appenabled = appenabled;
    }
    public String getModulesetting() {
        return modulesetting;
    }
    public void setModulesetting(String modulesetting) {
        this.modulesetting = modulesetting == null ? null : modulesetting.trim();
    }
    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }
}