package com.insaic.kylin.model.kylin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/12.
 */
public class CubesReturnData implements Serializable {
    private static final long serialVersionUID = 4146694907207087976L;

    private String uuid;

    @JsonProperty("last_modified")
    private String lastModified;

    private String version;

    private String name;

    private String owner;

    private String descriptor;

    private String cost;

    private String status;

    @JsonProperty("segments")
    private List<CubesSegment> cubesSegment;

    @JsonProperty("create_time_utc")
    private String createTimeUtc;

    @JsonProperty("size_kb")
    private String sizeKb;

    @JsonProperty("input_records_count")
    private String inputRecordsCount;

    @JsonProperty("input_records_size")
    private String inputRecordsSize;

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

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<CubesSegment> getCubesSegment() {
        return cubesSegment;
    }

    public void setCubesSegment(List<CubesSegment> cubesSegment) {
        this.cubesSegment = cubesSegment;
    }

    public String getCreateTimeUtc() {
        return createTimeUtc;
    }

    public void setCreateTimeUtc(String createTimeUtc) {
        this.createTimeUtc = createTimeUtc;
    }

    public String getSizeKb() {
        return sizeKb;
    }

    public void setSizeKb(String sizeKb) {
        this.sizeKb = sizeKb;
    }

    public String getInputRecordsCount() {
        return inputRecordsCount;
    }

    public void setInputRecordsCount(String inputRecordsCount) {
        this.inputRecordsCount = inputRecordsCount;
    }

    public String getInputRecordsSize() {
        return inputRecordsSize;
    }

    public void setInputRecordsSize(String inputRecordsSize) {
        this.inputRecordsSize = inputRecordsSize;
    }
}
