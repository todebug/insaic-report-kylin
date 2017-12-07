package com.insaic.kylin.model.kylin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/13.
 */
public class CubeDescAggregationGroupSelectRule implements Serializable {
    private static final long serialVersionUID = -4782139827571590157L;

    @JsonProperty("hierarchy_dims")
    private List<Object> hierarchyDims;

    @JsonProperty("mandatory_dims")
    private List<String> mandatoryDims;

    @JsonProperty("joint_dims")
    private List<Object> jointDims;

    public List<Object> getHierarchyDims() {
        return hierarchyDims;
    }

    public void setHierarchyDims(List<Object> hierarchyDims) {
        this.hierarchyDims = hierarchyDims;
    }

    public List<String> getMandatoryDims() {
        return mandatoryDims;
    }

    public void setMandatoryDims(List<String> mandatoryDims) {
        this.mandatoryDims = mandatoryDims;
    }

    public List<Object> getJointDims() {
        return jointDims;
    }

    public void setJointDims(List<Object> jointDims) {
        this.jointDims = jointDims;
    }
}
