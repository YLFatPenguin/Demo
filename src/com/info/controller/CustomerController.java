package com.info.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.info.entity.CustomerLinkman;
import com.info.entity.CustomerList;
import com.info.entity.PageBean;
import com.info.entity.vo.CustomerListVo;
import com.info.service.CustomerService;
import com.info.util.DateJsonValueProcessor;
import com.info.util.ResponseUtil;
import com.info.util.StringUtil;

@Controller
@RequestMapping(value = "/Customer")
public class CustomerController
{
    // controller依赖service层
    @Resource(name = "customerService")
    private CustomerService customerService;

    // springMVC处理前台form中的date类型的参数
    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @RequestMapping(value = "/CustomerList")
    public ModelAndView getCustomer()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("page/customerList");
        return mv;
    }

    // 客户列表 跳转成功，且已经实现分页查询
    @RequestMapping(value = "/listCustomer")
    public void listCustomer(@RequestParam(value = "page", required = false) String page,
            @RequestParam(value = "rows", required = false) String rows, CustomerList customer,
            HttpServletResponse response) throws Exception
    {
        PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", StringUtil.formatLike(customer.getName()));
        map.put("start", pageBean.getStart());
        map.put("size", pageBean.getPageSize());
        List<CustomerList> customerList = customerService.listCustomer(map);
        // 时间格式转换
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
        JSONArray jsonArray = JSONArray.fromObject(customerList, jsonConfig);
        int total = customerService.iTotalCustomerList(map);
        JSONObject result = new JSONObject();
        result.put("rows", jsonArray);
        result.put("total", total);
        ResponseUtil.write(response, result);
    }

    // 客户的详情页面 ---客户的详情，已经实现带数据传输到前台的功能,通过id去查询数据
    @RequestMapping(value = "/goCustomerInfo")
    public ModelAndView goCustomerInfo(@RequestParam(value = "id", required = false) int id) throws Exception
    {
        // 存储在map中，多个变量存放在map中去查询
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Integer", id);
        // 把数据存放到map中以后，通过调用dao的方法去查询数据库
        Object object = customerService.selectCustomer(id);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("page/customerDetail");
        mv.addObject(object);
        return mv;
    }

    // 客户编辑页面 ---实现带数据的编辑,只是跳转到编辑页面,已经完成！
    @RequestMapping(value = "/goCustomerEdit")
    public ModelAndView goCustomerEdit(@RequestParam(value = "id") int id) throws Exception
    {
        Object object = customerService.selectCustomer(id);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("page/customerEdit");
        mv.addObject(object);
        return mv;
    }

    // 查询寄送地址下拉框
    @RequestMapping(value = "/selectAddress")
    public void selectAddress(int id, HttpServletResponse response) throws Exception
    {
        List list = customerService.selectAddress(id);
        JSONArray jsonArray = JSONArray.fromObject(list);
        ResponseUtil.write(response, jsonArray);
    }

    // 查询客户来源下拉框
    @RequestMapping(value = "/selectOriginType")
    public void selectOriginType(HttpServletResponse response) throws Exception
    {
        List list = customerService.selectOriginType();
        JSONArray jsonArray = JSONArray.fromObject(list);
        ResponseUtil.write(response, jsonArray);
    }

    // 查询客户类型下拉框
    @RequestMapping(value = "/selectType")
    public void selectType(HttpServletResponse response) throws Exception
    {
        List list = customerService.selecetType();
        JSONArray jsonArray = JSONArray.fromObject(list);
        ResponseUtil.write(response, jsonArray);
    }

    // 更新客户页面 --- 实现成功 ，还有待改进
    @RequestMapping(value = "/updateCustomerInfo")
    public ModelAndView updateCustomerInfo(CustomerListVo customerListVo) throws Exception
    {
        // 先直接更新数据，调用mapper里面的update的方法去更新
        customerService.updateCustomerInfo(customerListVo);
        // 然后查询数据
        Object object = customerService.selectCustomer(customerListVo.getId());
        // 然后把数据返回到页面
        ModelAndView mv = new ModelAndView();
        // 这是返回到哪个页面
        mv.setViewName("page/customerEdit");
        // 这个是前端改的值
        mv.addObject(object);
        // 返回页面信息
        return mv;
    }

    // 新增客户页面 ---- 只是进到新增页面
    @RequestMapping(value = "/goAddCustomer")
    public ModelAndView goAddCustomer() throws Exception
    {
        // 直接插入数据，调用mapper的insert方法
        // customerService.insertCustomerInfo(customerList);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("page/addCustomer");
        return mv;
    }

    // 开始输入新客户数据，进行插入操作。完成
    @RequestMapping(value = "/insertNewCustomerInfo")
    public ModelAndView insertNewCustomerInfo(CustomerList customerList) throws Exception
    {
        // 进行数据插入操作
        customerService.insertCustomerInfo(customerList);
        ModelAndView mv = new ModelAndView();

        mv.addObject(customerList);
        return mv;
    }

    // 新增联系人 -- 进入到addLinkMan的页面
    @RequestMapping(value = "/goAddCustomerLinkMan")
    public ModelAndView addCustomerLinkMan()
    {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("page/addLinkMan");
        return mv;
    }

    // 新增联系人---开始插入新增联系人数据，进行插入操作
    @RequestMapping(value = "/insertLinkMan")
    public ModelAndView insertLinkMan(CustomerLinkman customerLinkman) throws Exception
    {
        customerService.insertCustomerLinkMan(customerLinkman);
        ModelAndView mv = new ModelAndView();
        mv.addObject(customerLinkman);
        return mv;
    }

    // 新增行动记录 ---页面正在画，还不确定数据库，有些东西还没写
    @RequestMapping(value = "/goAddCustomerAction")
    public ModelAndView addCustomerAction()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("page/addCustomerAction");
        return mv;
    }

    // 删除数据
    @RequestMapping(value = "/delete")
    public ModelAndView deleteCustomerInfo(int id) throws Exception
    {
        customerService.deleteCustomerInfo(id);
        return null;
    }

}
