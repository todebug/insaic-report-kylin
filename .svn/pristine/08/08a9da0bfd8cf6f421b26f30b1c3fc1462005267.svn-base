package com.insaic.kylin.handler;

import com.insaic.kylin.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by dongyang on 2017/10/9.
 */
@Component
public class LoginHandler {

    @Autowired
    private AuthenticationService authenticationService;

    /**
     * @Author dongyang
     * @Describe 登录验证
     * @Date 2017/10/9 下午1:41
     */
    public Map<String, Object> loginVerification(String userCode, String password) {
        return authenticationService.loginVerification(userCode, password);
    }

}
