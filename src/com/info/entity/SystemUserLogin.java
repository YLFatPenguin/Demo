/*
 * SystemUserLogin.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-01 Created
 */
package com.info.entity;

import java.util.Date;

public class SystemUserLogin {

    private Integer id;
    private Integer userid;
    private String ipaddress;
    private Date createdate;
    private Date lastaccesstime;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUserid() {
        return userid;
    }
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public String getIpaddress() {
        return ipaddress;
    }
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }
    public Date getCreatedate() {
        return createdate;
    }
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
    public Date getLastaccesstime() {
        return lastaccesstime;
    }
    public void setLastaccesstime(Date lastaccesstime) {
        this.lastaccesstime = lastaccesstime;
    }
}