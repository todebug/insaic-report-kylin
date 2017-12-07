package com.insaic.kylin.model.kylin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/12.
 */
public class QueryReturnData implements Serializable {
    private static final long serialVersionUID = -4570399047207851799L;

    @JsonProperty("columnMetas")
    private List<QueryColumnMeta> queryColumnMeta;

    @JsonProperty("results")
    private List<List<String>> results;

    private String cube;

    private String affectedRowCount;

    private String isException;

    private String exceptionMessage;

    private String duration;

    private String totalScanCount;

    private String totalScanBytes;

    private String hitExceptionCache;

    private String storageCacheUsed;

    private String pushDown;

    private String partial;

    public List<QueryColumnMeta> getQueryColumnMeta() {
        return queryColumnMeta;
    }

    public void setQueryColumnMeta(List<QueryColumnMeta> queryColumnMeta) {
        this.queryColumnMeta = queryColumnMeta;
    }

    public List<List<String>> getResults() {
        return results;
    }

    public void setResults(List<List<String>> results) {
        this.results = results;
    }

    public String getCube() {
        return cube;
    }

    public void setCube(String cube) {
        this.cube = cube;
    }

    public String getAffectedRowCount() {
        return affectedRowCount;
    }

    public void setAffectedRowCount(String affectedRowCount) {
        this.affectedRowCount = affectedRowCount;
    }

    public String getIsException() {
        return isException;
    }

    public void setIsException(String isException) {
        this.isException = isException;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTotalScanCount() {
        return totalScanCount;
    }

    public void setTotalScanCount(String totalScanCount) {
        this.totalScanCount = totalScanCount;
    }

    public String getTotalScanBytes() {
        return totalScanBytes;
    }

    public void setTotalScanBytes(String totalScanBytes) {
        this.totalScanBytes = totalScanBytes;
    }

    public String getHitExceptionCache() {
        return hitExceptionCache;
    }

    public void setHitExceptionCache(String hitExceptionCache) {
        this.hitExceptionCache = hitExceptionCache;
    }

    public String getStorageCacheUsed() {
        return storageCacheUsed;
    }

    public void setStorageCacheUsed(String storageCacheUsed) {
        this.storageCacheUsed = storageCacheUsed;
    }

    public String getPushDown() {
        return pushDown;
    }

    public void setPushDown(String pushDown) {
        this.pushDown = pushDown;
    }

    public String getPartial() {
        return partial;
    }

    public void setPartial(String partial) {
        this.partial = partial;
    }
}
