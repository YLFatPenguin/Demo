/*
 * SystemSettings.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-01 Created
 */
package com.info.entity;

public class SystemSettings {

    private String name;
    private String value;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}