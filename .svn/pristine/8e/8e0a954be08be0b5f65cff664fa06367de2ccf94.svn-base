package com.insaic.kylin.controller;

import com.insaic.base.exception.ExceptionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dongyang on 2017/9/12.
 */
@ControllerAdvice
public class BaseController {
    private static final Logger logger = LoggerFactory.getLogger(KylinController.class);

    @ExceptionHandler(value = {Exception.class})
    public @ResponseBody
    Map<String,Object> runtimeExceptionHandler(RuntimeException e) {
        ExceptionUtil.handleException(e);
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("error", true);
        modelMap.put("status", 999);
        modelMap.put("msg", "系统异常,请联系管理员!");
        modelMap.put("errorMessge", e.getMessage());

        return modelMap;
    }
}
