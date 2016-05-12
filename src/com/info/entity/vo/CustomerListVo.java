package com.info.entity.vo;

import com.info.entity.CustomerList;

public class CustomerListVo extends CustomerList
{
    private String ownerName;
    private String originTypeName;
    private String typeName;

    public String getTypeName()
    {
        return typeName;
    }

    public void setTypeName(String typeName)
    {
        this.typeName = typeName;
    }

    public String getOwnerName()
    {
        return ownerName;
    }

    public void setOwnerName(String ownerName)
    {
        this.ownerName = ownerName;
    }

    public String getOriginTypeName()
    {
        return originTypeName;
    }

    public void setOriginTypeName(String originTypeName)
    {
        this.originTypeName = originTypeName;
    }

}
