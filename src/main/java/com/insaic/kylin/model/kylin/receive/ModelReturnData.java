package com.insaic.kylin.model.kylin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/12.
 */
public class ModelReturnData implements Serializable {
    private static final long serialVersionUID = 7586935351600353654L;

    private String uuid;

    @JsonProperty("last_modified")
    private String lastModified;

    private String version;

    private String name;

    private String owner;

    @JsonProperty("is_draft")
    private String isDraft;

    private String description;

    @JsonProperty("fact_table")
    private String factTable;

    @JsonProperty("lookups")
    private List<ModelLookUp> modelLookUp;

    @JsonProperty("dimensions")
    private List<ModelDimension> modelDimension;

    @JsonProperty("metrics")
    private List<String> metrics;

    @JsonProperty("filter_condition")
    private String filterCondition;

    @JsonProperty("partition_desc")
    private ModelPartitionDesc modelPartitionDesc;

    private String capacity;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getIsDraft() {
        return isDraft;
    }

    public void setIsDraft(String isDraft) {
        this.isDraft = isDraft;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFactTable() {
        return factTable;
    }

    public void setFactTable(String factTable) {
        this.factTable = factTable;
    }

    public List<ModelLookUp> getModelLookUp() {
        return modelLookUp;
    }

    public void setModelLookUp(List<ModelLookUp> modelLookUp) {
        this.modelLookUp = modelLookUp;
    }

    public List<ModelDimension> getModelDimension() {
        return modelDimension;
    }

    public void setModelDimension(List<ModelDimension> modelDimension) {
        this.modelDimension = modelDimension;
    }

    public List<String> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<String> metrics) {
        this.metrics = metrics;
    }

    public String getFilterCondition() {
        return filterCondition;
    }

    public void setFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition;
    }

    public ModelPartitionDesc getModelPartitionDesc() {
        return modelPartitionDesc;
    }

    public void setModelPartitionDesc(ModelPartitionDesc modelPartitionDesc) {
        this.modelPartitionDesc = modelPartitionDesc;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
