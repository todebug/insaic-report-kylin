package com.insaic.kylin.model.kylin.download;

import com.insaic.kylin.enums.DonwloadFileStatus;
import com.insaic.kylin.model.kylin.query.KylinQueryData;

import java.io.Serializable;

/**
 * Created by dongyang on 2017/9/18.
 */
public class DownloadInfo implements Serializable{
    private static final long serialVersionUID = 926526986167090424L;

    private String fileCode;

    private String fileName;

    private DonwloadFileStatus fileStatus;

    private String fileStatusName;

    private KylinQueryData kylinQueryData;

    private String createUser;

    private String createTime;

    private String updateUser;

    private String updateTime;

    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public DonwloadFileStatus getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(DonwloadFileStatus fileStatus) {
        this.fileStatus = fileStatus;
    }

    public String getFileStatusName() {
        return fileStatusName;
    }

    public void setFileStatusName(String fileStatusName) {
        this.fileStatusName = fileStatusName;
    }

    public KylinQueryData getKylinQueryData() {
        return kylinQueryData;
    }

    public void setKylinQueryData(KylinQueryData kylinQueryData) {
        this.kylinQueryData = kylinQueryData;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
