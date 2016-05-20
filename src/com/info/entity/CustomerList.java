/*
 * CustomerList.java Copyright(C) 20xx-2015 xxxxxx公司 All rights reserved.
 * ----------------------------------------------- 2016-03-01 Created
 */
package com.info.entity;

import java.util.Date;

public class CustomerList
{

    private Integer id;
    private String name;
    private String shortname;
    private String linkman;
    private Integer area1;
    private Integer area2;
    private String telprefix;
    private String postalcode;
    private String tel;
    private String fax;
    private String email;
    private String web;
    private String address;
    private Integer origintype;
    private Integer type;
    private String memo;
    private Integer owner;

    private Date assigndate;
    private Integer createuser;
    private Date createdate;
    private Integer modifyuser;

    private Date modifydate;

    private Date lastactiondate;
    private String alpha1;
    private String alpha2;
    private String sharemembers;
    private String mobile;
    private String number;

    private Date birthdate;
    private Integer parentid;
    private Integer groupid;
    private String parentrelation;
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
    private String attachment;
    private String label;
    private String linkmantitle;
    private String wechat;
    private String qq;
    private String spell;
    private String pt;
    private String qrimageurl;
    private String certificate;
    private String certificatecode;
    private String sendtype;
    private String homeaddress;
    private String family;
    private String emergencylinkman;
    private String relationcustomer;
    private Integer sex;

    // 客户类型中文
    private String customertypename;
    // 业务员中文
    private String ownername;
    private Date firsttime;
    private Date lasttime;
    private Date dropdate;
    private String actiondays;
    private String actioncost;

    public Date getDropdate()
    {
        return dropdate;
    }

    public void setDropdate(Date dropdate)
    {
        this.dropdate = dropdate;
    }

    public String getActiondays()
    {
        return actiondays;
    }

    public void setActiondays(String actiondays)
    {
        this.actiondays = actiondays;
    }

    public String getActioncost()
    {
        return actioncost;
    }

    public void setActioncost(String actioncost)
    {
        this.actioncost = actioncost;
    }

    public Date getFirsttime()
    {
        return firsttime;
    }

    public void setFirsttime(Date firsttime)
    {
        this.firsttime = firsttime;
    }

    public Date getLasttime()
    {
        return lasttime;
    }

    public void setLasttime(Date lasttime)
    {
        this.lasttime = lasttime;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name == null ? null : name.trim();
    }

    public String getShortname()
    {
        return shortname;
    }

    public void setShortname(String shortname)
    {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    public String getLinkman()
    {
        return linkman;
    }

    public void setLinkman(String linkman)
    {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public Integer getArea1()
    {
        return area1;
    }

    public void setArea1(Integer area1)
    {
        this.area1 = area1;
    }

    public Integer getArea2()
    {
        return area2;
    }

    public void setArea2(Integer area2)
    {
        this.area2 = area2;
    }

    public String getTelprefix()
    {
        return telprefix;
    }

    public void setTelprefix(String telprefix)
    {
        this.telprefix = telprefix == null ? null : telprefix.trim();
    }

    public String getPostalcode()
    {
        return postalcode;
    }

    public void setPostalcode(String postalcode)
    {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getTel()
    {
        return tel;
    }

    public void setTel(String tel)
    {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getFax()
    {
        return fax;
    }

    public void setFax(String fax)
    {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email == null ? null : email.trim();
    }

    public String getWeb()
    {
        return web;
    }

    public void setWeb(String web)
    {
        this.web = web == null ? null : web.trim();
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address == null ? null : address.trim();
    }

    public Integer getOrigintype()
    {
        return origintype;
    }

    public void setOrigintype(Integer origintype)
    {
        this.origintype = origintype;
    }

    public Integer getType()
    {
        return type;
    }

    public void setType(Integer type)
    {
        this.type = type;
    }

    public String getMemo()
    {
        return memo;
    }

    public void setMemo(String memo)
    {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getOwner()
    {
        return owner;
    }

    public void setOwner(Integer owner)
    {
        this.owner = owner;
    }

    public Date getAssigndate()
    {
        return assigndate;
    }

    public void setAssigndate(Date assigndate)
    {
        this.assigndate = assigndate;
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

    public Integer getModifyuser()
    {
        return modifyuser;
    }

    public void setModifyuser(Integer modifyuser)
    {
        this.modifyuser = modifyuser;
    }

    public Date getModifydate()
    {
        return modifydate;
    }

    public void setModifydate(Date modifydate)
    {
        this.modifydate = modifydate;
    }

    public Date getLastactiondate()
    {
        return lastactiondate;
    }

    public void setLastactiondate(Date lastactiondate)
    {
        this.lastactiondate = lastactiondate;
    }

    public String getAlpha1()
    {
        return alpha1;
    }

    public void setAlpha1(String alpha1)
    {
        this.alpha1 = alpha1 == null ? null : alpha1.trim();
    }

    public String getAlpha2()
    {
        return alpha2;
    }

    public void setAlpha2(String alpha2)
    {
        this.alpha2 = alpha2 == null ? null : alpha2.trim();
    }

    public String getSharemembers()
    {
        return sharemembers;
    }

    public void setSharemembers(String sharemembers)
    {
        this.sharemembers = sharemembers == null ? null : sharemembers.trim();
    }

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number == null ? null : number.trim();
    }

    public Date getBirthdate()
    {
        return birthdate;
    }

    public void setBirthdate(Date birthdate)
    {
        this.birthdate = birthdate;
    }

    public Integer getParentid()
    {
        return parentid;
    }

    public void setParentid(Integer parentid)
    {
        this.parentid = parentid;
    }

    public Integer getGroupid()
    {
        return groupid;
    }

    public void setGroupid(Integer groupid)
    {
        this.groupid = groupid;
    }

    public String getParentrelation()
    {
        return parentrelation;
    }

    public void setParentrelation(String parentrelation)
    {
        this.parentrelation = parentrelation == null ? null : parentrelation.trim();
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

    public String getAttachment()
    {
        return attachment;
    }

    public void setAttachment(String attachment)
    {
        this.attachment = attachment == null ? null : attachment.trim();
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel(String label)
    {
        this.label = label == null ? null : label.trim();
    }

    public String getLinkmantitle()
    {
        return linkmantitle;
    }

    public void setLinkmantitle(String linkmantitle)
    {
        this.linkmantitle = linkmantitle == null ? null : linkmantitle.trim();
    }

    public String getWechat()
    {
        return wechat;
    }

    public void setWechat(String wechat)
    {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getQq()
    {
        return qq;
    }

    public void setQq(String qq)
    {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getSpell()
    {
        return spell;
    }

    public void setSpell(String spell)
    {
        this.spell = spell == null ? null : spell.trim();
    }

    public String getPt()
    {
        return pt;
    }

    public void setPt(String pt)
    {
        this.pt = pt == null ? null : pt.trim();
    }

    public String getQrimageurl()
    {
        return qrimageurl;
    }

    public void setQrimageurl(String qrimageurl)
    {
        this.qrimageurl = qrimageurl == null ? null : qrimageurl.trim();
    }

    public String getCertificate()
    {
        return certificate;
    }

    public void setCertificate(String certificate)
    {
        this.certificate = certificate == null ? null : certificate.trim();
    }

    public String getCertificatecode()
    {
        return certificatecode;
    }

    public void setCertificatecode(String certificatecode)
    {
        this.certificatecode = certificatecode == null ? null : certificatecode.trim();
    }

    public String getSendtype()
    {
        return sendtype;
    }

    public void setSendtype(String sendtype)
    {
        this.sendtype = sendtype == null ? null : sendtype.trim();
    }

    public String getHomeaddress()
    {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress)
    {
        this.homeaddress = homeaddress == null ? null : homeaddress.trim();
    }

    public String getFamily()
    {
        return family;
    }

    public void setFamily(String family)
    {
        this.family = family == null ? null : family.trim();
    }

    public String getEmergencylinkman()
    {
        return emergencylinkman;
    }

    public void setEmergencylinkman(String emergencylinkman)
    {
        this.emergencylinkman = emergencylinkman == null ? null : emergencylinkman.trim();
    }

    public String getRelationcustomer()
    {
        return relationcustomer;
    }

    public void setRelationcustomer(String relationcustomer)
    {
        this.relationcustomer = relationcustomer == null ? null : relationcustomer.trim();
    }

    public Integer getSex()
    {
        return sex;
    }

    public void setSex(Integer sex)
    {
        this.sex = sex;
    }

    public String getCustomertypename()
    {
        return customertypename;
    }

    public void setCustomertypename(String customertypename)
    {
        this.customertypename = customertypename;
    }

    public String getOwnername()
    {
        return ownername;
    }

    public void setOwnername(String ownername)
    {
        this.ownername = ownername;
    }

}