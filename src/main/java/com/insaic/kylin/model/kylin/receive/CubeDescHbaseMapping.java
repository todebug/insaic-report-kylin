package com.insaic.kylin.model.kylin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/13.
 */
public class CubeDescHbaseMapping implements Serializable {
    private static final long serialVersionUID = -5896180210845017877L;

    @JsonProperty("column_family")
    private List<CubeDescHbaseMappingColumnFamily> cubeDescHbaseMappingColumnFamily;

    public List<CubeDescHbaseMappingColumnFamily> getCubeDescHbaseMappingColumnFamily() {
        return cubeDescHbaseMappingColumnFamily;
    }

    public void setCubeDescHbaseMappingColumnFamily(List<CubeDescHbaseMappingColumnFamily> cubeDescHbaseMappingColumnFamily) {
        this.cubeDescHbaseMappingColumnFamily = cubeDescHbaseMappingColumnFamily;
    }
}
