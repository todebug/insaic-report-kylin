package com.insaic.kylin.model.kylin.project;

import java.io.Serializable;

/**
 * Created by dongyang on 2017/9/20.
 * fact table on foreign table facte.column = foreign.cloumn
 */
public class KylinJoinInfo implements Serializable {
    private static final long serialVersionUID = 3719231973848747697L;

    // 关联伪表code
    private String tableCode;

    private String tableName;

    // 查询展示列
    private String showColumn;

    // 关联主表列code,拼接sql进行匹配字段
    private String associationColumn;

    // 拼接sql(直接使用) 格式 {主表.列名 = 伪表.列名}
    private String associationSqlInfo;

    public String getTableCode() {
        return tableCode;
    }

    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getShowColumn() {
        return showColumn;
    }

    public void setShowColumn(String showColumn) {
        this.showColumn = showColumn;
    }

    public String getAssociationColumn() {
        return associationColumn;
    }

    public void setAssociationColumn(String associationColumn) {
        this.associationColumn = associationColumn;
    }

    public String getAssociationSqlInfo() {
        return associationSqlInfo;
    }

    public void setAssociationSqlInfo(String associationSqlInfo) {
        this.associationSqlInfo = associationSqlInfo;
    }
}
