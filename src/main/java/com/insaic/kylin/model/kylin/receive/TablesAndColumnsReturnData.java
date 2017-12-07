package com.insaic.kylin.model.kylin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/12.
 */
public class TablesAndColumnsReturnData implements Serializable {
    private static final long serialVersionUID = -8136945157709140225L;

    @JsonProperty("columns")
    private List<TablesAndColumnsColumn> tablesAndColumnsColumn;

    @JsonProperty("table_NAME")
    private String tableName;

    @JsonProperty("table_SCHEM")
    private String tableSchem;

    @JsonProperty("type_CAT")
    private String typeCat;

    @JsonProperty("type_SCHEM")
    private String typeSchem;

    @JsonProperty("table_TYPE")
    private String tableType;

    @JsonProperty("self_REFERENCING_COL_NAME")
    private String selfReferencingColName;

    @JsonProperty("ref_GENERATION")
    private String refGeneration;

    @JsonProperty("table_CAT")
    private String tableCat;

    @JsonProperty("type_NAME")
    private String typeName;

    private String remarks;

    public List<TablesAndColumnsColumn> getTablesAndColumnsColumn() {
        return tablesAndColumnsColumn;
    }

    public void setTablesAndColumnsColumn(List<TablesAndColumnsColumn> tablesAndColumnsColumn) {
        this.tablesAndColumnsColumn = tablesAndColumnsColumn;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableSchem() {
        return tableSchem;
    }

    public void setTableSchem(String tableSchem) {
        this.tableSchem = tableSchem;
    }

    public String getTypeCat() {
        return typeCat;
    }

    public void setTypeCat(String typeCat) {
        this.typeCat = typeCat;
    }

    public String getTypeSchem() {
        return typeSchem;
    }

    public void setTypeSchem(String typeSchem) {
        this.typeSchem = typeSchem;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public String getSelfReferencingColName() {
        return selfReferencingColName;
    }

    public void setSelfReferencingColName(String selfReferencingColName) {
        this.selfReferencingColName = selfReferencingColName;
    }

    public String getRefGeneration() {
        return refGeneration;
    }

    public void setRefGeneration(String refGeneration) {
        this.refGeneration = refGeneration;
    }

    public String getTableCat() {
        return tableCat;
    }

    public void setTableCat(String tableCat) {
        this.tableCat = tableCat;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
