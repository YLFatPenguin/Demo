/*
 * CustomerAction.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-01 Created
 */
package com.info.entity;

import java.util.Date;

public class CustomerAction {

    private Integer id;
    private Integer customerid;
    private Integer type;
    private Integer resultid;
    private Integer userid;
    private Date actiondate;
    private Date accessdate;
    private String memo;
    private String attachment;
    private Date createdate;
    private Integer linkmanid;
    private Integer projectid;
    private Integer signid;
    private String comment;
    private Integer status;
    private Integer timecost;
    private Date modifydate;
    private Integer modifyuser;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getCustomerid() {
        return customerid;
    }
    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getResultid() {
        return resultid;
    }
    public void setResultid(Integer resultid) {
        this.resultid = resultid;
    }
    public Integer getUserid() {
        return userid;
    }
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public Date getActiondate() {
        return actiondate;
    }
    public void setActiondate(Date actiondate) {
        this.actiondate = actiondate;
    }
    public Date getAccessdate() {
        return accessdate;
    }
    public void setAccessdate(Date accessdate) {
        this.accessdate = accessdate;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
    public String getAttachment() {
        return attachment;
    }
    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }
    public Date getCreatedate() {
        return createdate;
    }
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
    public Integer getLinkmanid() {
        return linkmanid;
    }
    public void setLinkmanid(Integer linkmanid) {
        this.linkmanid = linkmanid;
    }
    public Integer getProjectid() {
        return projectid;
    }
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }
    public Integer getSignid() {
        return signid;
    }
    public void setSignid(Integer signid) {
        this.signid = signid;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getTimecost() {
        return timecost;
    }
    public void setTimecost(Integer timecost) {
        this.timecost = timecost;
    }
    public Date getModifydate() {
        return modifydate;
    }
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
    public Integer getModifyuser() {
        return modifyuser;
    }
    public void setModifyuser(Integer modifyuser) {
        this.modifyuser = modifyuser;
    }
}