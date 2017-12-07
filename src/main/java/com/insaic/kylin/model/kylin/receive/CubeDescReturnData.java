package com.insaic.kylin.model.kylin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/12.
 */
public class CubeDescReturnData implements Serializable {
    private static final long serialVersionUID = 4962940468367513548L;

    private String uuid;

    @JsonProperty("last_modified")
    private String lastModified;

    private String version;

    private String name;

    private String is_draft;

    @JsonProperty("model_name")
    private String modelName;

    private String description;

    @JsonProperty("null_string")
    private String nullString;

    @JsonProperty("dimensions")
    private List<CubeDescDimension> cubeDescDimension;

    @JsonProperty("measures")
    private List<CubeDescMeasure> cubeDescMeasure;

    private List<Object> dictionaries;

    @JsonProperty("rowkey")
    private CubeDescRowKey cubeDescRowKey;

    @JsonProperty("hbase_mapping")
    private CubeDescHbaseMapping cubeDescHbaseMapping;

    @JsonProperty("aggregation_groups")
    private List<CubeDescAggregationGroup> cubeDescAggregationGroup;

    private String signature;

    @JsonProperty("notify_list")
    private List<Object> notifyList;

    @JsonProperty("status_need_notify")
    private List<String> statusNeedNotify;

    @JsonProperty("partition_date_start")
    private String partitionDateStart;

    @JsonProperty("partition_date_end")
    private String partitionDateEnd;

    @JsonProperty("auto_merge_time_ranges")
    private List<Object> autoMergeTimeRanges;

    @JsonProperty("retention_range")
    private String retentionRange;

    @JsonProperty("engine_type")
    private String engineType;

    @JsonProperty("storage_type")
    private String storageType;

    @JsonProperty("override_kylin_properties")
    private Object overrideKylinProperties;

    @JsonProperty("cuboid_black_list")
    private List<Object> cuboidBlackList;

    @JsonProperty("parent_forward")
    private String parentForward;

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

    public String getIs_draft() {
        return is_draft;
    }

    public void setIs_draft(String is_draft) {
        this.is_draft = is_draft;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNullString() {
        return nullString;
    }

    public void setNullString(String nullString) {
        this.nullString = nullString;
    }

    public List<CubeDescDimension> getCubeDescDimension() {
        return cubeDescDimension;
    }

    public void setCubeDescDimension(List<CubeDescDimension> cubeDescDimension) {
        this.cubeDescDimension = cubeDescDimension;
    }

    public List<CubeDescMeasure> getCubeDescMeasure() {
        return cubeDescMeasure;
    }

    public void setCubeDescMeasure(List<CubeDescMeasure> cubeDescMeasure) {
        this.cubeDescMeasure = cubeDescMeasure;
    }

    public List<Object> getDictionaries() {
        return dictionaries;
    }

    public void setDictionaries(List<Object> dictionaries) {
        this.dictionaries = dictionaries;
    }

    public CubeDescRowKey getCubeDescRowKey() {
        return cubeDescRowKey;
    }

    public void setCubeDescRowKey(CubeDescRowKey cubeDescRowKey) {
        this.cubeDescRowKey = cubeDescRowKey;
    }

    public CubeDescHbaseMapping getCubeDescHbaseMapping() {
        return cubeDescHbaseMapping;
    }

    public void setCubeDescHbaseMapping(CubeDescHbaseMapping cubeDescHbaseMapping) {
        this.cubeDescHbaseMapping = cubeDescHbaseMapping;
    }

    public List<CubeDescAggregationGroup> getCubeDescAggregationGroup() {
        return cubeDescAggregationGroup;
    }

    public void setCubeDescAggregationGroup(List<CubeDescAggregationGroup> cubeDescAggregationGroup) {
        this.cubeDescAggregationGroup = cubeDescAggregationGroup;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public List<Object> getNotifyList() {
        return notifyList;
    }

    public void setNotifyList(List<Object> notifyList) {
        this.notifyList = notifyList;
    }

    public List<String> getStatusNeedNotify() {
        return statusNeedNotify;
    }

    public void setStatusNeedNotify(List<String> statusNeedNotify) {
        this.statusNeedNotify = statusNeedNotify;
    }

    public String getPartitionDateStart() {
        return partitionDateStart;
    }

    public void setPartitionDateStart(String partitionDateStart) {
        this.partitionDateStart = partitionDateStart;
    }

    public String getPartitionDateEnd() {
        return partitionDateEnd;
    }

    public void setPartitionDateEnd(String partitionDateEnd) {
        this.partitionDateEnd = partitionDateEnd;
    }

    public List<Object> getAutoMergeTimeRanges() {
        return autoMergeTimeRanges;
    }

    public void setAutoMergeTimeRanges(List<Object> autoMergeTimeRanges) {
        this.autoMergeTimeRanges = autoMergeTimeRanges;
    }

    public String getRetentionRange() {
        return retentionRange;
    }

    public void setRetentionRange(String retentionRange) {
        this.retentionRange = retentionRange;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public Object getOverrideKylinProperties() {
        return overrideKylinProperties;
    }

    public void setOverrideKylinProperties(Object overrideKylinProperties) {
        this.overrideKylinProperties = overrideKylinProperties;
    }

    public List<Object> getCuboidBlackList() {
        return cuboidBlackList;
    }

    public void setCuboidBlackList(List<Object> cuboidBlackList) {
        this.cuboidBlackList = cuboidBlackList;
    }

    public String getParentForward() {
        return parentForward;
    }

    public void setParentForward(String parentForward) {
        this.parentForward = parentForward;
    }
}
