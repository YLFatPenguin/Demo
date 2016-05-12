/*
 * CustomerActionCost.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-01 Created
 */
package com.info.entity;

import java.util.Date;

public class CustomerActionCost {

    private Integer id;
    private Integer actionid;
    private Integer userid;
    private Integer type;
    private Double cost;
    private Date createdate;
    private Integer customerid;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getActionid() {
        return actionid;
    }
    public void setActionid(Integer actionid) {
        this.actionid = actionid;
    }
    public Integer getUserid() {
        return userid;
    }
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
    public Date getCreatedate() {
        return createdate;
    }
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
    public Integer getCustomerid() {
        return customerid;
    }
    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }
}