package com.info.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.info.util.Logger;

public class BaseController
{

    protected Logger logger = Logger.getLogger(this.getClass());

    private static final long serialVersionUID = 6357869213649815390L;

    /**
     * 得到ModelAndView
     */
    public ModelAndView getModelAndView()
    {
        return new ModelAndView();
    }

    /**
     * 得到request对象
     */
    public HttpServletRequest getRequest()
    {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();

        return request;
    }

    // /**
    // * 得到32位的uuid
    // *
    // * @return
    // */
    // public String get32UUID()
    // {
    //
    // return UuidUtil.get32UUID();
    // }

    public static void logBefore(Logger logger, String interfaceName)
    {
        logger.info("");
        logger.info("start");
        logger.info(interfaceName);
    }

    public static void logAfter(Logger logger)
    {
        logger.info("end");
        logger.info("");
    }

}
