/*
 * TeamUsergroups.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-01 Created
 */
package com.info.entity;

public class TeamUsergroups {

    private Integer id;
    private String name;
    private String color;
    private String permissionvalue;
    private Integer parentid;
    private String description;
    private String tel;

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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }
    public String getPermissionvalue() {
        return permissionvalue;
    }
    public void setPermissionvalue(String permissionvalue) {
        this.permissionvalue = permissionvalue == null ? null : permissionvalue.trim();
    }
    public Integer getParentid() {
        return parentid;
    }
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }
}