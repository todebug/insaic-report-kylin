package com.insaic.kylin.model.kylin.project;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.insaic.kylin.model.kylin.receive.CubeDescMeasure;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/13.
 */
public class KylinCubeInfo implements Serializable {
    private static final long serialVersionUID = -7253161631629924940L;

    private String projectCode;

    private String projectName;

    private String modelCode;

    private String modelName;

    private String cubeCode;

    private String cubeName;

    @JsonProperty("primaryTable")
    private KylinPrimaryTable kylinPrimaryTables;

    @JsonProperty("foreignTable")
    private List<KylinForeignTable> kylinForeignTables;

    @JsonIgnore
    private List<CubeDescMeasure> cubeDescMeasure;

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
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

    public KylinPrimaryTable getKylinPrimaryTables() {
        return kylinPrimaryTables;
    }

    public void setKylinPrimaryTables(KylinPrimaryTable kylinPrimaryTables) {
        this.kylinPrimaryTables = kylinPrimaryTables;
    }

    public List<KylinForeignTable> getKylinForeignTables() {
        return kylinForeignTables;
    }

    public void setKylinForeignTables(List<KylinForeignTable> kylinForeignTables) {
        this.kylinForeignTables = kylinForeignTables;
    }

    public List<CubeDescMeasure> getCubeDescMeasure() {
        return cubeDescMeasure;
    }

    public void setCubeDescMeasure(List<CubeDescMeasure> cubeDescMeasure) {
        this.cubeDescMeasure = cubeDescMeasure;
    }
}
