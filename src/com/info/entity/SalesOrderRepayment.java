/*
 * SalesOrderRepayment.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-01 Created
 */
package com.info.entity;

import java.util.Date;

public class SalesOrderRepayment {

    private Integer id;
    private Integer orderid;
    private String times;
    private Integer type;
    private Double money;
    private Double opmoney;
    private Date paydate;
    private Integer pay;
    private Date createdate;
    private Integer remind;
    private Double paymoney;
    private Date factpaydate;
    private String memo;
    private Integer moneypay;
    private Integer opmoneypay;
    private Byte submitpay;
    private Integer isadvance;
    private String bank;
    private String bankcode;

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
    public String getTimes() {
        return times;
    }
    public void setTimes(String times) {
        this.times = times == null ? null : times.trim();
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Double getMoney() {
        return money;
    }
    public void setMoney(Double money) {
        this.money = money;
    }
    public Double getOpmoney() {
        return opmoney;
    }
    public void setOpmoney(Double opmoney) {
        this.opmoney = opmoney;
    }
    public Date getPaydate() {
        return paydate;
    }
    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }
    public Integer getPay() {
        return pay;
    }
    public void setPay(Integer pay) {
        this.pay = pay;
    }
    public Date getCreatedate() {
        return createdate;
    }
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
    public Integer getRemind() {
        return remind;
    }
    public void setRemind(Integer remind) {
        this.remind = remind;
    }
    public Double getPaymoney() {
        return paymoney;
    }
    public void setPaymoney(Double paymoney) {
        this.paymoney = paymoney;
    }
    public Date getFactpaydate() {
        return factpaydate;
    }
    public void setFactpaydate(Date factpaydate) {
        this.factpaydate = factpaydate;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
    public Integer getMoneypay() {
        return moneypay;
    }
    public void setMoneypay(Integer moneypay) {
        this.moneypay = moneypay;
    }
    public Integer getOpmoneypay() {
        return opmoneypay;
    }
    public void setOpmoneypay(Integer opmoneypay) {
        this.opmoneypay = opmoneypay;
    }
    public Byte getSubmitpay() {
        return submitpay;
    }
    public void setSubmitpay(Byte submitpay) {
        this.submitpay = submitpay;
    }
    public Integer getIsadvance() {
        return isadvance;
    }
    public void setIsadvance(Integer isadvance) {
        this.isadvance = isadvance;
    }
    public String getBank() {
        return bank;
    }
    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }
    public String getBankcode() {
        return bankcode;
    }
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode == null ? null : bankcode.trim();
    }
}