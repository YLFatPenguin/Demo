/*
 * SalesOrderList.java Copyright(C) 20xx-2015 xxxxxx公司 All rights reserved.
 * ----------------------------------------------- 2016-03-01 Created
 */
package com.info.entity;

import java.util.Date;

public class SalesOrderList
{
    private Integer id;
    private String title;
    private Integer customerid;
    private Integer submituser;
    private Date submitdate;
    private Double orderprice;
    private Integer status;
    private Integer createuser;
    private Date createdate;
    private String memo;
    private String attachment;
    private String customfield1;
    private String customfield2;
    private String customfield3;
    private String customfield4;
    private String customfield5;
    private String customfield6;
    private String customfield7;
    private String customfield8;
    private String customfield9;
    private String customfield10;
    private String customfield11;
    private String customfield12;
    private String customfield13;
    private String customfield14;
    private String customfield15;
    private String customfield16;
    private String customfield17;
    private String customfield18;
    private String customfield19;
    private String customfield20;
    private String extramembers;
    private Byte isaudit;
    private String contracturl;
    private Date startdate;
    private Date enddate;
    private Integer loantype;
    private Integer investtime;
    private Integer investtimetype;
    private String bank;
    private String bankcode;
    private Double profit;
    private Double totalprice;
    private Date loandate;
    private Date factenddate;
    private Byte isadvance;
    private String endtype;
    private Double facttotalprice;
    private Integer auditstatus;

    private String customername;
    private String productname;

    private int productid;
    private String idprofit;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title == null ? null : title.trim();
    }

    public Integer getCustomerid()
    {
        return customerid;
    }

    public void setCustomerid(Integer customerid)
    {
        this.customerid = customerid;
    }

    public Integer getSubmituser()
    {
        return submituser;
    }

    public void setSubmituser(Integer submituser)
    {
        this.submituser = submituser;
    }

    public Date getSubmitdate()
    {
        return submitdate;
    }

    public void setSubmitdate(Date submitdate)
    {
        this.submitdate = submitdate;
    }

    public Double getOrderprice()
    {
        return orderprice;
    }

    public void setOrderprice(Double orderprice)
    {
        this.orderprice = orderprice;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }

    public Integer getCreateuser()
    {
        return createuser;
    }

    public void setCreateuser(Integer createuser)
    {
        this.createuser = createuser;
    }

    public Date getCreatedate()
    {
        return createdate;
    }

    public void setCreatedate(Date createdate)
    {
        this.createdate = createdate;
    }

    public String getMemo()
    {
        return memo;
    }

    public void setMemo(String memo)
    {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getAttachment()
    {
        return attachment;
    }

    public void setAttachment(String attachment)
    {
        this.attachment = attachment == null ? null : attachment.trim();
    }

    public String getCustomfield1()
    {
        return customfield1;
    }

    public void setCustomfield1(String customfield1)
    {
        this.customfield1 = customfield1 == null ? null : customfield1.trim();
    }

    public String getCustomfield2()
    {
        return customfield2;
    }

    public void setCustomfield2(String customfield2)
    {
        this.customfield2 = customfield2 == null ? null : customfield2.trim();
    }

    public String getCustomfield3()
    {
        return customfield3;
    }

    public void setCustomfield3(String customfield3)
    {
        this.customfield3 = customfield3 == null ? null : customfield3.trim();
    }

    public String getCustomfield4()
    {
        return customfield4;
    }

    public void setCustomfield4(String customfield4)
    {
        this.customfield4 = customfield4 == null ? null : customfield4.trim();
    }

    public String getCustomfield5()
    {
        return customfield5;
    }

    public void setCustomfield5(String customfield5)
    {
        this.customfield5 = customfield5 == null ? null : customfield5.trim();
    }

    public String getCustomfield6()
    {
        return customfield6;
    }

    public void setCustomfield6(String customfield6)
    {
        this.customfield6 = customfield6 == null ? null : customfield6.trim();
    }

    public String getCustomfield7()
    {
        return customfield7;
    }

    public void setCustomfield7(String customfield7)
    {
        this.customfield7 = customfield7 == null ? null : customfield7.trim();
    }

    public String getCustomfield8()
    {
        return customfield8;
    }

    public void setCustomfield8(String customfield8)
    {
        this.customfield8 = customfield8 == null ? null : customfield8.trim();
    }

    public String getCustomfield9()
    {
        return customfield9;
    }

    public void setCustomfield9(String customfield9)
    {
        this.customfield9 = customfield9 == null ? null : customfield9.trim();
    }

    public String getCustomfield10()
    {
        return customfield10;
    }

    public void setCustomfield10(String customfield10)
    {
        this.customfield10 = customfield10 == null ? null : customfield10.trim();
    }

    public String getCustomfield11()
    {
        return customfield11;
    }

    public void setCustomfield11(String customfield11)
    {
        this.customfield11 = customfield11 == null ? null : customfield11.trim();
    }

    public String getCustomfield12()
    {
        return customfield12;
    }

    public void setCustomfield12(String customfield12)
    {
        this.customfield12 = customfield12 == null ? null : customfield12.trim();
    }

    public String getCustomfield13()
    {
        return customfield13;
    }

    public void setCustomfield13(String customfield13)
    {
        this.customfield13 = customfield13 == null ? null : customfield13.trim();
    }

    public String getCustomfield14()
    {
        return customfield14;
    }

    public void setCustomfield14(String customfield14)
    {
        this.customfield14 = customfield14 == null ? null : customfield14.trim();
    }

    public String getCustomfield15()
    {
        return customfield15;
    }

    public void setCustomfield15(String customfield15)
    {
        this.customfield15 = customfield15 == null ? null : customfield15.trim();
    }

    public String getCustomfield16()
    {
        return customfield16;
    }

    public void setCustomfield16(String customfield16)
    {
        this.customfield16 = customfield16 == null ? null : customfield16.trim();
    }

    public String getCustomfield17()
    {
        return customfield17;
    }

    public void setCustomfield17(String customfield17)
    {
        this.customfield17 = customfield17 == null ? null : customfield17.trim();
    }

    public String getCustomfield18()
    {
        return customfield18;
    }

    public void setCustomfield18(String customfield18)
    {
        this.customfield18 = customfield18 == null ? null : customfield18.trim();
    }

    public String getCustomfield19()
    {
        return customfield19;
    }

    public void setCustomfield19(String customfield19)
    {
        this.customfield19 = customfield19 == null ? null : customfield19.trim();
    }

    public String getCustomfield20()
    {
        return customfield20;
    }

    public void setCustomfield20(String customfield20)
    {
        this.customfield20 = customfield20 == null ? null : customfield20.trim();
    }

    public String getExtramembers()
    {
        return extramembers;
    }

    public void setExtramembers(String extramembers)
    {
        this.extramembers = extramembers == null ? null : extramembers.trim();
    }

    public Byte getIsaudit()
    {
        return isaudit;
    }

    public void setIsaudit(Byte isaudit)
    {
        this.isaudit = isaudit;
    }

    public String getContracturl()
    {
        return contracturl;
    }

    public void setContracturl(String contracturl)
    {
        this.contracturl = contracturl == null ? null : contracturl.trim();
    }

    public Date getStartdate()
    {
        return startdate;
    }

    public void setStartdate(Date startdate)
    {
        this.startdate = startdate;
    }

    public Date getEnddate()
    {
        return enddate;
    }

    public void setEnddate(Date enddate)
    {
        this.enddate = enddate;
    }

    public Integer getLoantype()
    {
        return loantype;
    }

    public void setLoantype(Integer loantype)
    {
        this.loantype = loantype;
    }

    public Integer getInvesttime()
    {
        return investtime;
    }

    public void setInvesttime(Integer investtime)
    {
        this.investtime = investtime;
    }

    public Integer getInvesttimetype()
    {
        return investtimetype;
    }

    public void setInvesttimetype(Integer investtimetype)
    {
        this.investtimetype = investtimetype;
    }

    public String getBank()
    {
        return bank;
    }

    public void setBank(String bank)
    {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getBankcode()
    {
        return bankcode;
    }

    public void setBankcode(String bankcode)
    {
        this.bankcode = bankcode == null ? null : bankcode.trim();
    }

    public Double getProfit()
    {
        return profit;
    }

    public void setProfit(Double profit)
    {
        this.profit = profit;
    }

    public Double getTotalprice()
    {
        return totalprice;
    }

    public void setTotalprice(Double totalprice)
    {
        this.totalprice = totalprice;
    }

    public Date getLoandate()
    {
        return loandate;
    }

    public void setLoandate(Date loandate)
    {
        this.loandate = loandate;
    }

    public Date getFactenddate()
    {
        return factenddate;
    }

    public void setFactenddate(Date factenddate)
    {
        this.factenddate = factenddate;
    }

    public Byte getIsadvance()
    {
        return isadvance;
    }

    public void setIsadvance(Byte isadvance)
    {
        this.isadvance = isadvance;
    }

    public String getEndtype()
    {
        return endtype;
    }

    public void setEndtype(String endtype)
    {
        this.endtype = endtype == null ? null : endtype.trim();
    }

    public Double getFacttotalprice()
    {
        return facttotalprice;
    }

    public void setFacttotalprice(Double facttotalprice)
    {
        this.facttotalprice = facttotalprice;
    }

    public Integer getAuditstatus()
    {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus)
    {
        this.auditstatus = auditstatus;
    }

    public String getCustomername()
    {
        return customername;
    }

    public void setCustomername(String customername)
    {
        this.customername = customername;
    }

    public String getProductname()
    {
        return productname;
    }

    public void setProductname(String productname)
    {
        this.productname = productname;
    }

    public int getProductid()
    {
        return productid;
    }

    public void setProductid(int productid)
    {
        this.productid = productid;
    }

    public String getIdprofit()
    {
        return idprofit;
    }

    public void setIdprofit(String idprofit)
    {
        this.idprofit = idprofit;
    }
}