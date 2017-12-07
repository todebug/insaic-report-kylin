package com.insaic.kylin.model.kylin.init;

import com.insaic.kylin.model.kylin.project.*;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/13.
 */
public class KylinLoadCube implements Serializable {
    private static final long serialVersionUID = -8006237297488540708L;

    // uuid
    private String uuid;

    // cubecode
    private String cubeCode;

    // cubename
    private String cubeName;

    // 主表信息
    private KylinPrimaryTable kylinPrimaryTable;

    // 度量信息
    private List<KylinLoadMeasure> kylinLoadMeasures;

    // 伪表信息
    private List<KylinForeignTable> kylinForeignTables;

    // 主表伪表关联信息
    private List<KylinJoinInfo> kylinJoinInfos;

    // 用户自定义限制条件
    private List<KylinLimitInfo> kylinLimitInfos;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCubeCode() {
        return cubeCode;
    }

    public void setCubeCode(String cubeCode) {
        this.cubeCode = cubeCode;
    }

    public String getCubeName() {
        return cubeName;
    }

    public void setCubeName(String cubeName) {
        this.cubeName = cubeName;
    }

    public KylinPrimaryTable getKylinPrimaryTable() {
        return kylinPrimaryTable;
    }

    public void setKylinPrimaryTable(KylinPrimaryTable kylinPrimaryTable) {
        this.kylinPrimaryTable = kylinPrimaryTable;
    }

    public List<KylinLoadMeasure> getKylinLoadMeasures() {
        return kylinLoadMeasures;
    }

    public void setKylinLoadMeasures(List<KylinLoadMeasure> kylinLoadMeasures) {
        this.kylinLoadMeasures = kylinLoadMeasures;
    }

    public List<KylinForeignTable> getKylinForeignTables() {
        return kylinForeignTables;
    }

    public void setKylinForeignTables(List<KylinForeignTable> kylinForeignTables) {
        this.kylinForeignTables = kylinForeignTables;
    }

    public List<KylinJoinInfo> getKylinJoinInfos() {
        return kylinJoinInfos;
    }

    public void setKylinJoinInfos(List<KylinJoinInfo> kylinJoinInfos) {
        this.kylinJoinInfos = kylinJoinInfos;
    }

    public List<KylinLimitInfo> getKylinLimitInfos() {
        return kylinLimitInfos;
    }

    public void setKylinLimitInfos(List<KylinLimitInfo> kylinLimitInfos) {
        this.kylinLimitInfos = kylinLimitInfos;
    }
}
