package com.insaic.kylin.service;

import com.insaic.kylin.model.kylin.init.KylinLoadSelectOption;

import java.util.List;
import java.util.Map;

/**
 * Created by dongyang on 2017/10/9.
 */
public interface AuthenticationService {

    /**
     * @Author dongyang
     * @Describe 登录验证
     * @Date 2017/10/9 下午2:38
     */
    Map<String, Object> loginVerification(String userCode, String password);

    /**
     * @Author dongyang
     * @Describe 下拉列表权限过滤
     * @Date 2017/10/10 下午2:54
     */
    List<KylinLoadSelectOption> getSelectMenuByUser(List<KylinLoadSelectOption> kylinLoadSelectOptions, String userCode);

}
