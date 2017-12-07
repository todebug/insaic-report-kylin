package com.insaic.kylin.model.kylin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/13.
 */
public class CubeDescAggregationGroup implements Serializable {
    private static final long serialVersionUID = -2322206040167162485L;

    @JsonProperty("includes")
    private List<String> includes;

    @JsonProperty("select_rule")
    private CubeDescAggregationGroupSelectRule selectRule;

    public List<String> getIncludes() {
        return includes;
    }

    public void setIncludes(List<String> includes) {
        this.includes = includes;
    }

    public CubeDescAggregationGroupSelectRule getSelectRule() {
        return selectRule;
    }

    public void setSelectRule(CubeDescAggregationGroupSelectRule selectRule) {
        this.selectRule = selectRule;
    }
}
