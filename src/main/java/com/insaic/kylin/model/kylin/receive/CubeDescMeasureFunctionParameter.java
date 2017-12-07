package com.insaic.kylin.model.kylin.receive;

import java.io.Serializable;

/**
 * Created by dongyang on 2017/9/12.
 */
public class CubeDescMeasureFunctionParameter implements Serializable {
    private static final long serialVersionUID = 1648899970803673099L;

    private String type;

    private String value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
