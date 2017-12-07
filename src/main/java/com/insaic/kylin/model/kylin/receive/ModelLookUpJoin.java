package com.insaic.kylin.model.kylin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/12.
 */
public class ModelLookUpJoin implements Serializable {
    private static final long serialVersionUID = 1312333399685504679L;

    private String type;

    @JsonProperty("primary_key")
    private List<String> primaryKeys;

    @JsonProperty("foreign_key")
    private List<String> foreignKey;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getPrimaryKeys() {
        return primaryKeys;
    }

    public void setPrimaryKeys(List<String> primaryKeys) {
        this.primaryKeys = primaryKeys;
    }

    public List<String> getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(List<String> foreignKey) {
        this.foreignKey = foreignKey;
    }
}
