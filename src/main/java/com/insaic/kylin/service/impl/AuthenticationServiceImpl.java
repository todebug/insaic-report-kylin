package com.insaic.kylin.service.impl;

import com.insaic.kylin.model.kylin.init.KylinLoadSelectOption;
import com.insaic.kylin.service.AuthenticationService;
import com.insaic.kylin.service.logic.AuthenticationHandler;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by dongyang on 2017/10/9.
 */
@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private AuthenticationHandler authenticationHandler;

    /**
     * @Author dongyang
     * @Describe 登录验证
     * @Date 2017/10/9 下午1:41
     */
    public Map<String, Object> loginVerification(String userCode, String password) {
        return authenticationHandler.loginVerification(userCode, password);
    }

    /**
     * @Author dongyang
     * @Describe 下拉列表权限过滤
     * @Date 2017/10/10 下午2:54
     */
    public List<KylinLoadSelectOption> getSelectMenuByUser(List<KylinLoadSelectOption> kylinLoadSelectOptions, String userCode) {
        return authenticationHandler.getSelectMenuByUser(kylinLoadSelectOptions, userCode);
    }

}
