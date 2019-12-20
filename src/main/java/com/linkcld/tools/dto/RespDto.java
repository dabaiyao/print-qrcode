package com.linkcld.tools.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by zhangjy on 2019/12/20.
 */
@Data
@ApiModel("返回对象")
public class RespDto implements Serializable {

    /**
     * 接口成功标志
     */
    @ApiModelProperty("接口成功标志")
    private boolean success;

    /**
     * 提示信息
     */
    @ApiModelProperty("提示信息")
    private String msg;

    /**
     * 数据实体
     */
    @ApiModelProperty("数据实体")
    private String data;

}
