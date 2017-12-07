package com.insaic.kylin.model.kylin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/12.
 */
public class CubesSegment implements Serializable {
    private static final long serialVersionUID = -8134233640490963612L;

    private String uuid;

    private String name;

    @JsonProperty("storage_location_identifier")
    private String storageLocationIdentifier;

    @JsonProperty("date_range_start")
    private String dateRangeStart;

    @JsonProperty("date_range_end")
    private String dateRangeEnd;

    @JsonProperty("source_offset_start")
    private String sourceOffsetStart;

    @JsonProperty("source_offset_end")
    private String sourceOffsetEnd;

    private String status;

    @JsonProperty("size_kb")
    private String sizeKb;

    @JsonProperty("input_records")
    private String inputRecords;

    @JsonProperty("input_records_size")
    private String inputRecordsSize;

    @JsonProperty("last_build_time")
    private String lastBuildTime;

    @JsonProperty("last_build_job_id")
    private String lastBuildJobId;

    @JsonProperty("create_time_utc")
    private String createTimeUtc;

    @JsonProperty("cuboid_shard_nums")
    private Object cuboidShardNums;

    @JsonProperty("total_shards")
    private String totalShards;

    @JsonProperty("blackout_cuboids")
    private List<Object> blackoutCuboids;

    @JsonProperty("binary_signature")
    private String binarySignature;

    @JsonProperty("dictionaries")
    private Object dictionarie;

    @JsonProperty("snapshots")
    private Object snapshot;

    @JsonProperty("rowkey_stats")
    private List<List<String>> rowkeyStats;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStorageLocationIdentifier() {
        return storageLocationIdentifier;
    }

    public void setStorageLocationIdentifier(String storageLocationIdentifier) {
        this.storageLocationIdentifier = storageLocationIdentifier;
    }

    public String getDateRangeStart() {
        return dateRangeStart;
    }

    public void setDateRangeStart(String dateRangeStart) {
        this.dateRangeStart = dateRangeStart;
    }

    public String getDateRangeEnd() {
        return dateRangeEnd;
    }

    public void setDateRangeEnd(String dateRangeEnd) {
        this.dateRangeEnd = dateRangeEnd;
    }

    public String getSourceOffsetStart() {
        return sourceOffsetStart;
    }

    public void setSourceOffsetStart(String sourceOffsetStart) {
        this.sourceOffsetStart = sourceOffsetStart;
    }

    public String getSourceOffsetEnd() {
        return sourceOffsetEnd;
    }

    public void setSourceOffsetEnd(String sourceOffsetEnd) {
        this.sourceOffsetEnd = sourceOffsetEnd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSizeKb() {
        return sizeKb;
    }

    public void setSizeKb(String sizeKb) {
        this.sizeKb = sizeKb;
    }

    public String getInputRecords() {
        return inputRecords;
    }

    public void setInputRecords(String inputRecords) {
        this.inputRecords = inputRecords;
    }

    public String getInputRecordsSize() {
        return inputRecordsSize;
    }

    public void setInputRecordsSize(String inputRecordsSize) {
        this.inputRecordsSize = inputRecordsSize;
    }

    public String getLastBuildTime() {
        return lastBuildTime;
    }

    public void setLastBuildTime(String lastBuildTime) {
        this.lastBuildTime = lastBuildTime;
    }

    public String getLastBuildJobId() {
        return lastBuildJobId;
    }

    public void setLastBuildJobId(String lastBuildJobId) {
        this.lastBuildJobId = lastBuildJobId;
    }

    public String getCreateTimeUtc() {
        return createTimeUtc;
    }

    public void setCreateTimeUtc(String createTimeUtc) {
        this.createTimeUtc = createTimeUtc;
    }

    public Object getCuboidShardNums() {
        return cuboidShardNums;
    }

    public void setCuboidShardNums(Object cuboidShardNums) {
        this.cuboidShardNums = cuboidShardNums;
    }

    public String getTotalShards() {
        return totalShards;
    }

    public void setTotalShards(String totalShards) {
        this.totalShards = totalShards;
    }

    public List<Object> getBlackoutCuboids() {
        return blackoutCuboids;
    }

    public void setBlackoutCuboids(List<Object> blackoutCuboids) {
        this.blackoutCuboids = blackoutCuboids;
    }

    public String getBinarySignature() {
        return binarySignature;
    }

    public void setBinarySignature(String binarySignature) {
        this.binarySignature = binarySignature;
    }

    public Object getDictionarie() {
        return dictionarie;
    }

    public void setDictionarie(Object dictionarie) {
        this.dictionarie = dictionarie;
    }

    public Object getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(Object snapshot) {
        this.snapshot = snapshot;
    }

    public List<List<String>> getRowkeyStats() {
        return rowkeyStats;
    }

    public void setRowkeyStats(List<List<String>> rowkeyStats) {
        this.rowkeyStats = rowkeyStats;
    }
}
