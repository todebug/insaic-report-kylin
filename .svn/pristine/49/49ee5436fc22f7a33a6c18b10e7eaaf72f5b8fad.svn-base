package com.insaic.kylin.model.kylin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/13.
 */
public class CubeDescHbaseMappingColumnFamily implements Serializable {
    private static final long serialVersionUID = -6298549027964320233L;

    private String name;

    @JsonProperty("columns")
    private List<CubeDescHbaseMappingColumnFamilyColumn> cubeDescHbaseMappingColumnFamilyColumn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CubeDescHbaseMappingColumnFamilyColumn> getCubeDescHbaseMappingColumnFamilyColumn() {
        return cubeDescHbaseMappingColumnFamilyColumn;
    }

    public void setCubeDescHbaseMappingColumnFamilyColumn(List<CubeDescHbaseMappingColumnFamilyColumn> cubeDescHbaseMappingColumnFamilyColumn) {
        this.cubeDescHbaseMappingColumnFamilyColumn = cubeDescHbaseMappingColumnFamilyColumn;
    }
}
