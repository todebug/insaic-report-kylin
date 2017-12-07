package com.insaic.kylin.service.impl;

import com.insaic.kylin.service.HbaseService;
import com.insaic.kylin.service.logic.HbaseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by dongyang on 2017/9/26.
 */
@Service
public class HbaseServiceImpl implements HbaseService{

    @Autowired
    private HbaseHandler hbaseHandler;

    /**
     * @Author dongyang
     * @Describe 获取前端载入信息
     * @Date 2017/9/27 下午2:02
     */
    public Map<String, Object> getKylinLoadInfo() {
        return hbaseHandler.getKylinLoadInfo();
    }

    /**
     * @Author dongyang
     * @Describe 更新数据库信息
     * @Date 2017/10/18 下午2:57
     */
    public void updateKylinLoadInfo(Map<String, Object> operateInfo) {
        hbaseHandler.updateKylinLoadInfo(operateInfo);
    }
}
