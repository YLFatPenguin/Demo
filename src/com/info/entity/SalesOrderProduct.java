/*
 * SalesOrderProduct.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-01 Created
 */
package com.info.entity;

import java.util.Date;

public class SalesOrderProduct {

    private Integer id;
    private Integer orderid;
    private Integer projectid;
    private Integer productid;
    private Double amount;
    private Double salesprice;
    private Integer opuserid;
    private String memo;
    private Double price;
    private Date createdate;

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
    public Integer getProjectid() {
        return projectid;
    }
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }
    public Integer getProductid() {
        return productid;
    }
    public void setProductid(Integer productid) {
        this.productid = productid;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Double getSalesprice() {
        return salesprice;
    }
    public void setSalesprice(Double salesprice) {
        this.salesprice = salesprice;
    }
    public Integer getOpuserid() {
        return opuserid;
    }
    public void setOpuserid(Integer opuserid) {
        this.opuserid = opuserid;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Date getCreatedate() {
        return createdate;
    }
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}