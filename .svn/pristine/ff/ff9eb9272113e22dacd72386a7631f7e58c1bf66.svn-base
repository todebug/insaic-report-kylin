package com.insaic.kylin.model.kylin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/13.
 */
public class CubeDescHbaseMappingColumnFamilyColumn implements Serializable {
    private static final long serialVersionUID = -1864345870033638231L;

    private String qualifier;

    @JsonProperty("measure_refs")
    private List<String> measureRefs;

    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public List<String> getMeasureRefs() {
        return measureRefs;
    }

    public void setMeasureRefs(List<String> measureRefs) {
        this.measureRefs = measureRefs;
    }
}
