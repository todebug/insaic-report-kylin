package com.insaic.kylin.model.kylin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by dongyang on 2017/9/12.
 */
public class TablesAndColumnsColumn implements Serializable {
    private static final long serialVersionUID = -573220443912870941L;

    @JsonProperty("table_NAME")
    private String tableName;

    @JsonProperty("table_SCHEM")
    private String tableSchem;

    @JsonProperty("column_NAME")
    private String columnName;

    @JsonProperty("column_DEF")
    private String columnDef;

    @JsonProperty("sql_DATA_TYPE")
    private String sqlDataType;

    @JsonProperty("sql_DATETIME_SUB")
    private String sqlDatetimeSub;

    @JsonProperty("char_OCTET_LENGTH")
    private String charOctetLength;

    @JsonProperty("ordinal_POSITION")
    private String ordinalPosition;

    @JsonProperty("is_NULLABLE")
    private String isNullAble;

    @JsonProperty("scope_CATLOG")
    private String scopeCatlog;

    @JsonProperty("scope_SCHEMA")
    private String scopeSchema;

    @JsonProperty("scope_TABLE")
    private String scopeTable;

    @JsonProperty("source_DATA_TYPE")
    private String sourceDataType;

    @JsonProperty("is_AUTOINCREMENT")
    private String isAutoIncrement;

    @JsonProperty("table_CAT")
    private String tableCat;

    @JsonProperty("data_TYPE")
    private String dataType;

    @JsonProperty("type_NAME")
    private String typeName;

    @JsonProperty("column_SIZE")
    private String columnSize;

    @JsonProperty("buffer_LENGTH")
    private String bufferLength;

    @JsonProperty("decimal_DIGITS")
    private String decimalDigits;

    @JsonProperty("num_PREC_RADIX")
    private String numPrecRadix;

    @JsonProperty("nullable")
    private String nullAble;

    private String remarks;

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

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnDef() {
        return columnDef;
    }

    public void setColumnDef(String columnDef) {
        this.columnDef = columnDef;
    }

    public String getSqlDataType() {
        return sqlDataType;
    }

    public void setSqlDataType(String sqlDataType) {
        this.sqlDataType = sqlDataType;
    }

    public String getSqlDatetimeSub() {
        return sqlDatetimeSub;
    }

    public void setSqlDatetimeSub(String sqlDatetimeSub) {
        this.sqlDatetimeSub = sqlDatetimeSub;
    }

    public String getCharOctetLength() {
        return charOctetLength;
    }

    public void setCharOctetLength(String charOctetLength) {
        this.charOctetLength = charOctetLength;
    }

    public String getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(String ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public String getIsNullAble() {
        return isNullAble;
    }

    public void setIsNullAble(String isNullAble) {
        this.isNullAble = isNullAble;
    }

    public String getScopeCatlog() {
        return scopeCatlog;
    }

    public void setScopeCatlog(String scopeCatlog) {
        this.scopeCatlog = scopeCatlog;
    }

    public String getScopeSchema() {
        return scopeSchema;
    }

    public void setScopeSchema(String scopeSchema) {
        this.scopeSchema = scopeSchema;
    }

    public String getScopeTable() {
        return scopeTable;
    }

    public void setScopeTable(String scopeTable) {
        this.scopeTable = scopeTable;
    }

    public String getSourceDataType() {
        return sourceDataType;
    }

    public void setSourceDataType(String sourceDataType) {
        this.sourceDataType = sourceDataType;
    }

    public String getIsAutoIncrement() {
        return isAutoIncrement;
    }

    public void setIsAutoIncrement(String isAutoIncrement) {
        this.isAutoIncrement = isAutoIncrement;
    }

    public String getTableCat() {
        return tableCat;
    }

    public void setTableCat(String tableCat) {
        this.tableCat = tableCat;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getColumnSize() {
        return columnSize;
    }

    public void setColumnSize(String columnSize) {
        this.columnSize = columnSize;
    }

    public String getBufferLength() {
        return bufferLength;
    }

    public void setBufferLength(String bufferLength) {
        this.bufferLength = bufferLength;
    }

    public String getDecimalDigits() {
        return decimalDigits;
    }

    public void setDecimalDigits(String decimalDigits) {
        this.decimalDigits = decimalDigits;
    }

    public String getNumPrecRadix() {
        return numPrecRadix;
    }

    public void setNumPrecRadix(String numPrecRadix) {
        this.numPrecRadix = numPrecRadix;
    }

    public String getNullAble() {
        return nullAble;
    }

    public void setNullAble(String nullAble) {
        this.nullAble = nullAble;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
