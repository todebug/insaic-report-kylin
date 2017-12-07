package com.insaic.kylin.filter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.insaic.base.RequestResult;
import com.insaic.base.exception.ExceptionUtil;
import com.insaic.base.mapper.JsonMapper;
import com.insaic.base.utils.SpringBeanLocator;
import com.insaic.common.security.entity.FunctionEO;
import com.insaic.common.security.entity.UserEO;
import com.insaic.common.security.model.SecurityDTO;
import com.insaic.common.security.service.SecurityService;
import org.apache.commons.collections.CollectionUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dongyang on 2017/9/29.
 */
public class AuthenticationFilter implements Filter {


    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        String requestUrl = request.getRequestURL().toString();
        // 如登录操作,则判断用户是否有权限
        if (requestUrl.contains("/login/verify/")) {
            boolean noPermission = true;
            SecurityDTO securityInfo = null;
            try {
                String userCode = requestUrl.split("login/verify/")[1].split("/")[0];
                SecurityService securityService = SpringBeanLocator.getBean("securityService",SecurityService.class);
                UserEO userEO = securityService.getUserInfo(userCode);
                if (userEO == null) {
                    response.setContentType("application/json;charset=utf-8");
                    response.setCharacterEncoding("utf-8");
                    PrintWriter writer = response.getWriter();
                    Map<String, Object> modelMap = new HashMap<String, Object>();
                    modelMap.put("loginFlag", false);
                    modelMap.put("status", 999);
                    modelMap.put("errorMsg", "用户名错误,请重试!");
                    writer.println(JsonMapper.nonEmptyMapper().toJson(modelMap));
                    writer.flush();
                    writer.close();
                    return;
                }
                securityInfo = securityService.getUserSecurity(userCode, "INSAIC-REPORT");
            } catch (Exception e) {
                ExceptionUtil.handleException(e);
            }
            if (null != securityInfo) {
                List<FunctionEO> functionEOS = securityInfo.getFunctionEOList();
                if (CollectionUtils.isNotEmpty(functionEOS)) {
                    for (FunctionEO fun : functionEOS) {
                        if ("report_004".equals(fun.getParentFuncCode())) {
                            noPermission = false;
                            break;
                        }
                    }
                }
            }
            // 没有权限,则返回
            if (noPermission) {
                response.setContentType("application/json;charset=utf-8");
                response.setCharacterEncoding("utf-8");
                PrintWriter writer = response.getWriter();
                Map<String, Object> modelMap = new HashMap<String, Object>();
                modelMap.put("loginFlag", false);
                modelMap.put("status", 999);
                modelMap.put("errorMsg", "该用户暂无麒麟报表查询权限,请联系管理员确认!");
                writer.println(JsonMapper.nonEmptyMapper().toJson(modelMap));
                writer.flush();
                writer.close();
                return;
            }
        }

        chain.doFilter(req, res);
    }

    public void init(FilterConfig filterConfig) {
    }

    public void destroy() {}
}
