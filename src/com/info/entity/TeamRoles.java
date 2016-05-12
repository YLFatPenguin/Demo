/*
 * TeamRoles.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-01 Created
 */
package com.info.entity;

public class TeamRoles {

    private Integer id;
    private String name;
    private Byte isgroupmanager;
    private String permissionvalue;
    private String inheritid;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public Byte getIsgroupmanager() {
        return isgroupmanager;
    }
    public void setIsgroupmanager(Byte isgroupmanager) {
        this.isgroupmanager = isgroupmanager;
    }
    public String getPermissionvalue() {
        return permissionvalue;
    }
    public void setPermissionvalue(String permissionvalue) {
        this.permissionvalue = permissionvalue == null ? null : permissionvalue.trim();
    }
    public String getInheritid() {
        return inheritid;
    }
    public void setInheritid(String inheritid) {
        this.inheritid = inheritid == null ? null : inheritid.trim();
    }
}