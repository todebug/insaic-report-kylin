package com.insaic.kylin.model.kylin.query;

import com.insaic.kylin.model.kylin.project.KylinForeignTable;
import com.insaic.kylin.model.kylin.project.KylinJoinInfo;
import com.insaic.kylin.model.kylin.project.KylinLoadMeasure;
import com.insaic.kylin.model.kylin.project.KylinPrimaryTable;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by dongyang on 2017/9/12.
 */
public class KylinQueryData implements Serializable {
    private static final long serialVersionUID = 8269885564527879297L;

    // 工程code
    private String project;

    // 模块code
    private String model;

    // cubecode
    private String cube;

    // 主表
    private String primaryTable;

    // 关联伪表
    private List<KylinForeignTable> foreignTables;

    // 关联字段
    private List<KylinJoinInfo> joinInfos;

    // 维度
    private List<String> dimensions;

    // 度量
    private List<String> measures;

    // 日期
    private List<String> date;

    // 用户自定义限制条件 map --> code,value
    private List<Map<String, String>> limits;

    // kylin参数
    private String acceptPartial;

    // kylin参数
    private String offset;

    // kylin参数
    private String limit;

    // 主表信息(翻译)
    private KylinPrimaryTable kylinPrimaryTable;

    // 度量信息(翻译)
    private List<KylinLoadMeasure> kylinLoadMeasures;

    // 伪表信息(翻译)
    private List<KylinForeignTable> kylinForeignTables;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCube() {
        return cube;
    }

    public void setCube(String cube) {
        this.cube = cube;
    }

    public String getPrimaryTable() {
        return primaryTable;
    }

    public void setPrimaryTable(String primaryTable) {
        this.primaryTable = primaryTable;
    }

    public List<KylinForeignTable> getForeignTables() {
        return foreignTables;
    }

    public void setForeignTables(List<KylinForeignTable> foreignTables) {
        this.foreignTables = foreignTables;
    }

    public List<KylinJoinInfo> getJoinInfos() {
        return joinInfos;
    }

    public void setJoinInfos(List<KylinJoinInfo> joinInfos) {
        this.joinInfos = joinInfos;
    }

    public List<String> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<String> dimensions) {
        this.dimensions = dimensions;
    }

    public List<String> getMeasures() {
        return measures;
    }

    public void setMeasures(List<String> measures) {
        this.measures = measures;
    }

    public List<String> getDate() {
        return date;
    }

    public void setDate(List<String> date) {
        this.date = date;
    }

    public List<Map<String, String>> getLimits() {
        return limits;
    }

    public void setLimits(List<Map<String, String>> limits) {
        this.limits = limits;
    }

    public String getAcceptPartial() {
        return acceptPartial;
    }

    public void setAcceptPartial(String acceptPartial) {
        this.acceptPartial = acceptPartial;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
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
}
