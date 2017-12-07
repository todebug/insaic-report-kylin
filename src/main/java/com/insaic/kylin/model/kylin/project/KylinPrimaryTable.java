package com.insaic.kylin.model.kylin.project;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/13.
 */
public class KylinPrimaryTable implements Serializable {
    private static final long serialVersionUID = 5312915456864399431L;

    private String tableCode;

    private String tableName;

    // 维度字段
    private List<KylinColumnInfo> dimensionColumnInfos;

    // 度量字段
    private List<KylinColumnInfo> measureColumnInfos;

    public String getTableCode() {
        return tableCode;
    }

    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<KylinColumnInfo> getDimensionColumnInfos() {
        return dimensionColumnInfos;
    }

    public void setDimensionColumnInfos(List<KylinColumnInfo> dimensionColumnInfos) {
        this.dimensionColumnInfos = dimensionColumnInfos;
    }

    public List<KylinColumnInfo> getMeasureColumnInfos() {
        return measureColumnInfos;
    }

    public void setMeasureColumnInfos(List<KylinColumnInfo> measureColumnInfos) {
        this.measureColumnInfos = measureColumnInfos;
    }
}
