package com.info.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.info.entity.PageBean;
import com.info.entity.SalesOrderList;
import com.info.service.SalesService;
import com.info.util.DateJsonValueProcessor;
import com.info.util.ResponseUtil;
import com.info.util.StringUtil;

@Controller
@RequestMapping(value = "/Sales")
public class SalesController
{
    @Resource(name = "salesService")
    private SalesService salesService;

    @RequestMapping(value = "/salesOrderList")
    public ModelAndView getSalesOrderList()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("page/salesOrderList");
        return mv;
    }

    @RequestMapping(value = "/listSalesOrder")
    public void listSalesOrder(@RequestParam(value = "page", required = false) String page,
            @RequestParam(value = "rows", required = false) String rows, SalesOrderList salesOrderList,
            HttpServletResponse response) throws Exception
    {
        PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", StringUtil.formatLike(salesOrderList.getProductname()));
        map.put("start", pageBean.getStart());
        map.put("size", pageBean.getPageSize());
        List<SalesOrderList> salesOrderList1 = salesService.listSalesOrder(map);
        // 时间格式转换
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
        JSONArray jsonArray = JSONArray.fromObject(salesOrderList1, jsonConfig);
        int total = salesService.iTotalSalesOrderList(map);
        JSONObject result = new JSONObject();
        result.put("rows", jsonArray);
        result.put("total", total);
        ResponseUtil.write(response, result);
    }

    // 合同的详细信息
    @RequestMapping(value = "/goSalesOrderInfo")
    public ModelAndView salesOrderInfo(Integer id) throws Exception
    {
        // 把查询到的值存放到一个东西里面
        SalesOrderList salesOrderList = salesService.selectOrderById(id);
        // 这是调用一个方法去转到一个页面
        ModelAndView mv = new ModelAndView();
        mv.setViewName("page/salesOrderDetail");
        // 把查询到的东西添加到跳转的页面里面，通过前台的的标签识别，一一对应的去填充值进去
        mv.addObject(salesOrderList);
        return mv;
    }

    // 编辑合同
    @RequestMapping(value = "/goSalesOrderEdit")
    public ModelAndView salesOrderEdit(Integer id) throws Exception
    {
        SalesOrderList salesOrderList = salesService.selectOrderById(id);
        // 查询结束后，就需要将它推送到一个页面上
        ModelAndView mv = new ModelAndView();
        mv.setViewName("page/salesOrderEdit");
        mv.addObject(salesOrderList);
        return mv;
    }

    // 新增合同
    @RequestMapping(value = "/goAddOrder")
    public ModelAndView addSalesOrder()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("page/addSalesOrder");
        return mv;
    }

}
