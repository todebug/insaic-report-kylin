package com.insaic.kylin.model.kylin.init;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/13.
 */
public class KylinLoadProject implements Serializable {
    private static final long serialVersionUID = -9177561112541211845L;

    private String projectCode;

    private String projectName;

    private List<KylinLoadModel> kylinLoadModels;

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

    public List<KylinLoadModel> getKylinLoadModels() {
        return kylinLoadModels;
    }

    public void setKylinLoadModels(List<KylinLoadModel> kylinLoadModels) {
        this.kylinLoadModels = kylinLoadModels;
    }
}
