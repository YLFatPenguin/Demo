/*
 * SalesOrderAdvance.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-01 Created
 */
package com.info.entity;

import java.util.Date;

public class SalesOrderAdvance {

    private Integer id;
    private Integer orderid;
    private Date factenddate;
    private Double money;
    private String endtype;
    private Byte audit;
    private Date loandate;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getOrderid() {
        return orderid;
    }
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }
    public Date getFactenddate() {
        return factenddate;
    }
    public void setFactenddate(Date factenddate) {
        this.factenddate = factenddate;
    }
    public Double getMoney() {
        return money;
    }
    public void setMoney(Double money) {
        this.money = money;
    }
    public String getEndtype() {
        return endtype;
    }
    public void setEndtype(String endtype) {
        this.endtype = endtype == null ? null : endtype.trim();
    }
    public Byte getAudit() {
        return audit;
    }
    public void setAudit(Byte audit) {
        this.audit = audit;
    }
    public Date getLoandate() {
        return loandate;
    }
    public void setLoandate(Date loandate) {
        this.loandate = loandate;
    }
}