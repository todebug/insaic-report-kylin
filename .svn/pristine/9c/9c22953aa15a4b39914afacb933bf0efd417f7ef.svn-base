package com.insaic.kylin.service.impl;

import com.insaic.kylin.model.kylin.query.KylinQueryInfo;
import com.insaic.kylin.model.kylin.receive.*;
import com.insaic.kylin.service.KylinBaseService;
import com.insaic.kylin.service.logic.KylinBaseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dongyang on 2017/9/12.
 */
@Service
public class KylinBaseServiceImpl implements KylinBaseService {

    @Autowired
    private KylinBaseHandler kylinBaseHandler;

    /**
     * @Author dongyang
     * @Describe 获取cubes列表
     * @Date 2017/9/12 下午6:39
     */
    @Override
    public List<CubesReturnData> getKylinCubes() {
        return kylinBaseHandler.getKylinCubes();
    }

    /**
     * @Author dongyang
     * @Describe 获取具体cube内容
     * @Date 2017/9/12 下午6:40
     */
    @Override
    public CubesReturnData getKylinCube(String cube) {
        return kylinBaseHandler.getKylinCube(cube);
    }

    /**
     * @Author dongyang
     * @Describe 获取单个cube内容(详细)
     * @Date 2017/9/12 下午6:47
     */
    @Override
    public List<CubeDescReturnData> getKylinCubeDesc(String cube) {
        return kylinBaseHandler.getKylinCubeDesc(cube);
    }

    /**
     * @Author dongyang
     * @Describe 获取某一project下表及列信息
     * @Date 2017/9/12 下午7:07
     */
    @Override
    public List<TablesAndColumnsReturnData> getKylinTablesAndColumns(String project) {
        return kylinBaseHandler.getKylinTablesAndColumns(project);
    }

    /**
     * @Author dongyang
     * @Describe 获取model内容
     * @Date 2017/9/12 下午7:41
     */
    @Override
    public ModelReturnData getKylinModel(String model) {
        return kylinBaseHandler.getKylinModel(model);
    }

    /**
     * @Author dongyang
     * @Describe 获取登录用户权限信息
     * @Date 2017/9/12 下午8:10
     */
    @Override
    public UserAuthenticationReturnData getKylinUserAuthentication() {
        return kylinBaseHandler.getKylinUserAuthentication();
    }

    /**
     * @Author dongyang
     * @Describe 获取querySql信息
     * @Date 2017/9/12 下午8:10
     */
    @Override
    public QueryReturnData getKylinQuery(KylinQueryInfo queryInfo) {
        return kylinBaseHandler.getKylinQuery(queryInfo);
    }

}
