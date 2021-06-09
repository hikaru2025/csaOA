package com.ndys.csaoa.controller;

import com.ndys.common.support.api.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xm
 * @date 2021/6/9 16:58
 */
@Api(tags = "测试接口")
@RestController
public class TestController {

    @ApiOperation(value = "hello world 接口")
    @GetMapping("/test")
    public R test() {
        return R.data("hello world");
    }
}
