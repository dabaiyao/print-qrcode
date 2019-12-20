package com.linkcld.tools.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangjy on 2019/12/20.
 */
@Api(description = "二维码打印服务")
@RestController
@RequestMapping("/qrcode")
public class ApiController {


    @GetMapping(value = "/print")
    @ApiOperation("打印二维码")
    public void print() throws Exception {


    }


}
