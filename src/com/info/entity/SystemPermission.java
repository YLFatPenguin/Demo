/*
 * SystemPermission.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-01 Created
 */
package com.info.entity;

public class SystemPermission {

    private Integer id;
    private Integer moduleid;
    private String name;
    private String description;
    private Byte scope;
    private Byte danger;
    private String code;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getModuleid() {
        return moduleid;
    }
    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
    public Byte getScope() {
        return scope;
    }
    public void setScope(Byte scope) {
        this.scope = scope;
    }
    public Byte getDanger() {
        return danger;
    }
    public void setDanger(Byte danger) {
        this.danger = danger;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}