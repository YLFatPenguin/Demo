/*
 * ProjectLinkmanList.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-01 Created
 */
package com.info.entity;

public class ProjectLinkmanList {

    private Integer id;
    private Integer projectid;
    private Integer parentid;
    private String corp;
    private String name;
    private Integer decision;
    private String effect;
    private String title;
    private String contactway;
    private String description;
    private Integer relation;
    private Integer supporttype;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getProjectid() {
        return projectid;
    }
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }
    public Integer getParentid() {
        return parentid;
    }
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
    public String getCorp() {
        return corp;
    }
    public void setCorp(String corp) {
        this.corp = corp == null ? null : corp.trim();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public Integer getDecision() {
        return decision;
    }
    public void setDecision(Integer decision) {
        this.decision = decision;
    }
    public String getEffect() {
        return effect;
    }
    public void setEffect(String effect) {
        this.effect = effect == null ? null : effect.trim();
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
    public String getContactway() {
        return contactway;
    }
    public void setContactway(String contactway) {
        this.contactway = contactway == null ? null : contactway.trim();
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
    public Integer getRelation() {
        return relation;
    }
    public void setRelation(Integer relation) {
        this.relation = relation;
    }
    public Integer getSupporttype() {
        return supporttype;
    }
    public void setSupporttype(Integer supporttype) {
        this.supporttype = supporttype;
    }
}