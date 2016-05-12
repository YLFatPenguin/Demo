package com.info.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.info.dao.DaoSupport;
import com.info.entity.SalesOrderList;

@Service("salesService")
public class SalesService
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
    public List<SalesOrderList> listSalesOrder(Map<String, Object> map) throws Exception
    {
        return (List<SalesOrderList>) dao.findForList("SalesOrderListMapper.listSalesOrder", map);
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
    public SalesOrderList selectOrderById(int id) throws Exception
    {
        return (SalesOrderList) dao.findForObject("SalesOrderListMapper.selectOrderById", id);

    }

    // 查询合同表总记录信息
    public int iTotalSalesOrderList(Map<String, Object> map) throws Exception
    {
        return (int) dao.findForObject("SalesOrderListMapper.iTotalSalesOrderList", map);
    }
}
