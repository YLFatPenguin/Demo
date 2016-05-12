/*
 * SystemCurrency.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-03-01 Created
 */
package com.info.entity;

public class SystemCurrency {

    private Integer id;
    private String currencycountry;
    private String currencyname;
    private String currencyvalue;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCurrencycountry() {
        return currencycountry;
    }
    public void setCurrencycountry(String currencycountry) {
        this.currencycountry = currencycountry == null ? null : currencycountry.trim();
    }
    public String getCurrencyname() {
        return currencyname;
    }
    public void setCurrencyname(String currencyname) {
        this.currencyname = currencyname == null ? null : currencyname.trim();
    }
    public String getCurrencyvalue() {
        return currencyvalue;
    }
    public void setCurrencyvalue(String currencyvalue) {
        this.currencyvalue = currencyvalue == null ? null : currencyvalue.trim();
    }
}