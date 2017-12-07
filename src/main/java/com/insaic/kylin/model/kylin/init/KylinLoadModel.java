package com.insaic.kylin.model.kylin.init;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/13.
 */
public class KylinLoadModel implements Serializable {
    private static final long serialVersionUID = 5101674294710666477L;

    private String modelCode;

    private String modelName;

    private List<KylinLoadCube> kylinLoadCubes;

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

    public List<KylinLoadCube> getKylinLoadCubes() {
        return kylinLoadCubes;
    }

    public void setKylinLoadCubes(List<KylinLoadCube> kylinLoadCubes) {
        this.kylinLoadCubes = kylinLoadCubes;
    }
}
