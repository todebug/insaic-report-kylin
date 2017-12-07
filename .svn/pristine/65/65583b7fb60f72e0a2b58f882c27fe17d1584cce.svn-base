package com.insaic.kylin.model.kylin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by dongyang on 2017/9/12.
 */
public class CubeDescMeasureFunction implements Serializable {
    private static final long serialVersionUID = -7194400544867189311L;

    private String expression;

    @JsonProperty("parameter")
    private CubeDescMeasureFunctionParameter cubeDescMeasureFunctionParameter;

    @JsonProperty("returntype")
    private String returnType;

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public CubeDescMeasureFunctionParameter getCubeDescMeasureFunctionParameter() {
        return cubeDescMeasureFunctionParameter;
    }

    public void setCubeDescMeasureFunctionParameter(CubeDescMeasureFunctionParameter cubeDescMeasureFunctionParameter) {
        this.cubeDescMeasureFunctionParameter = cubeDescMeasureFunctionParameter;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }
}
