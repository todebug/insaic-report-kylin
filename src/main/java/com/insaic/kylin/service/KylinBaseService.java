package com.insaic.kylin.service;

import com.insaic.kylin.model.kylin.query.KylinQueryInfo;
import com.insaic.kylin.model.kylin.receive.*;

import java.util.List;

/**
 * Created by dongyang on 2017/9/12.
 */
public interface KylinBaseService {

    /**
     * @Author dongyang
     * @Describe 获取cubes列表
     * @Date 2017/9/12 下午6:39
     */
    List<CubesReturnData> getKylinCubes();

    /**
     * @Author dongyang
     * @Describe 获取具体cube内容
     * @Date 2017/9/12 下午6:43
     */
    CubesReturnData getKylinCube(String cube);

    /**
     * @Author dongyang
     * @Describe 获取单个cube内容(详细)
     * @Date 2017/9/12 下午7:02
     */
    List<CubeDescReturnData> getKylinCubeDesc(String cube);

    /**
     * @Author dongyang
     * @Describe 获取某一project下表及列信息
     * @Date 2017/9/12 下午7:07
     */
    List<TablesAndColumnsReturnData> getKylinTablesAndColumns(String project);

    /**
     * @Author dongyang
     * @Describe 获取model内容
     * @Date 2017/9/12 下午7:41
     */
    ModelReturnData getKylinModel(String model);

    /**
     * @Author dongyang
     * @Describe 获取登录用户权限信息
     * @Date 2017/9/12 下午8:10
     */
    UserAuthenticationReturnData getKylinUserAuthentication();

    /**
     * @Author dongyang
     * @Describe 获取querySql信息
     * @Date 2017/9/12 下午8:10
     */
    QueryReturnData getKylinQuery(KylinQueryInfo queryInfo);

}
