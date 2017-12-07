package com.insaic.kylin.controller;

import com.insaic.kylin.handler.LoginHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by dongyang on 2017/10/9.
 */
@Controller
@RequestMapping("/kylin")
public class LoginController {

    @Autowired
    private LoginHandler loginHandler;

    /**
     * @Author dongyang
     * @Describe 登录验证
     * @Date 2017/10/9 下午2:09
     */
    @RequestMapping(value = "/login/verify/{userCode}/{password}", method = RequestMethod.GET)
    public @ResponseBody
    Map<String, Object> loadSelectInfo(@PathVariable("userCode") String userCode,
                                       @PathVariable("password") String password) {
        Map<String, Object> modelMap = loginHandler.loginVerification(userCode, password);

        return modelMap;
    }

}
