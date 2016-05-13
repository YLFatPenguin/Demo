package com.info.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.info.dao.DaoSupport;
import com.info.entity.CustomerLinkman;
import com.info.entity.CustomerList;
import com.info.entity.SalesOrderList;
import com.info.entity.vo.CustomerListVo;

@Service
public class CustomerService
{
    @Resource(name = "daoSupport")
    private DaoSupport dao;

    // 保存合同
    public void saveSalesOrder(HashMap map) throws Exception
    {
        dao.save("SalesOrderListMapper.saveSalesOrder", map);
    }

    // 新增合同信息
    public int insertSalesOrder(SalesOrderList salesOrderList) throws Exception
    {
        return (int) dao.save("SalesOrderListMapper.insertSalesOrder", salesOrderList);
    }

    // 修改合同信息
    public int updateSalesOrder(SalesOrderList salesOrderList) throws Exception
    {
        return (int) dao.save("SalesOrderListMapper.updateSalesOrder", salesOrderList);
    }

    // 客户列表
    public List<CustomerList> listCustomer(Map<String, Object> map) throws Exception
    {
        return (List<CustomerList>) dao.findForList("CustomerListMapper.listCustomer", map);
    }

    // 查询合同状态下拉框
    public List<HashMap<String, String>> getProductList() throws Exception
    {
        return (List<HashMap<String, String>>) dao.findForList("SalesOrderListMapper.getProductList", null);
    }

    // 查询支付方式下拉框
    public List<HashMap<String, String>> getLoanType() throws Exception
    {
        return (List<HashMap<String, String>>) dao.findForList("SalesOrderListMapper.getLoanType", null);
    }

    // 查询产品列表下拉框
    public List<HashMap<String, String>> getOrderStatus() throws Exception
    {
        return (List<HashMap<String, String>>) dao.findForList("SalesOrderListMapper.getOrderStatus", null);
    }

    // 通过id获取数据
    public CustomerList selectCustomerById(int id) throws Exception
    {
        return (CustomerList) dao.findForObject("CustomerListMapper.selectCustomerById", id);
    }

    // 查询合同表总记录信息
    public int iTotalCustomerList(Map<String, Object> map) throws Exception
    {
        return (int) dao.findForObject("CustomerListMapper.iTotalCustomerList", map);
    }

    // 更新客户信息
    public int updateCustomerInfo(CustomerListVo customerListVo) throws Exception
    {
        return (int) dao.update("CustomerListMapper.updateCustomerInfo", customerListVo);
    }

    // 新增客户信息
    public int insertCustomerInfo(CustomerList customerList) throws Exception
    {
        return (int) dao.save("CustomerListMapper.insertCustomerInfo", customerList);
    }

    // 新增客户联系人
    public int insertCustomerLinkMan(CustomerLinkman customerLinkman) throws Exception
    {
        return (int) dao.save("CustomerLinkmanMapper.insert", customerLinkman);
    }

    // 删除联系人
    public int deleteCustomerInfo(int id) throws Exception
    {
        return (int) dao.delete("CustomerListMapper.deleteCustomerInfo", id);
    }

    // 查询
    public CustomerListVo selectCustomer(int id) throws Exception
    {
        return (CustomerListVo) dao.findForObject("CustomerListMapper.selectCustomer", id);
    }

    // 查询寄送地址下拉框
    public List selectAddress(int parentId) throws Exception
    {
        return (List) dao.findForList("CustomerListMapper.selectAddress", parentId);
    }

    // 查询客户来源下拉框
    public List selectOriginType() throws Exception
    {
        return (List) dao.findForList("CustomerListMapper.selectOriginType", null);
    }

    // 查询客户类型下拉框
    public List selecetType() throws Exception
    {
        return (List) dao.findForList("CustomerListMapper.selectType", null);
    }
}
