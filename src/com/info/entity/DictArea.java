/*
 * DictArea.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-01 Created
 */
package com.info.entity;

public class DictArea {

    private Integer id;
    private Integer parentid;
    private String text;
    private String areacode;
    private String postalcode;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getParentid() {
        return parentid;
    }
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
    public String getAreacode() {
        return areacode;
    }
    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }
    public String getPostalcode() {
        return postalcode;
    }
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }
}