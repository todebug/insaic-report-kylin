package com.insaic.kylin.model.kylin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by dongyang on 2017/9/12.
 */
public class ModelLookUp implements Serializable{
    private static final long serialVersionUID = 6530434182467893098L;

    private String table;

    private String kind;

    private String alias;

    @JsonProperty("join")
    private ModelLookUpJoin modelLookUpJoin;

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ModelLookUpJoin getModelLookUpJoin() {
        return modelLookUpJoin;
    }

    public void setModelLookUpJoin(ModelLookUpJoin modelLookUpJoin) {
        this.modelLookUpJoin = modelLookUpJoin;
    }
}
