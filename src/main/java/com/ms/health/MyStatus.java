package com.ms.health;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/**
 * Created by GulsahCoskun on 28.05.2018.
 */
@ApiModel(description = "My status desc", value = "test value")
public class MyStatus {

    @Size(max = 20)
    @NotEmpty
    @ApiModelProperty(required = false)
    private String desc;

    @NotEmpty
    @Pattern(regexp = "[0-9]+")
    private String extra;

    private String detail;

    @Max(1000)
    @Min(100)
    private int cause;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getCause() {
        return cause;
    }

    public void setCause(int cause) {
        this.cause = cause;
    }

    @Override
    public String toString() {
        return "MyStatus{" +
                "desc='" + desc + '\'' +
                ", extra='" + extra + '\'' +
                ", detail='" + detail + '\'' +
                ", cause=" + cause +
                '}';
    }
}
