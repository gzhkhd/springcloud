package com.gzh.nacosfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuyl8@asiainfo.com
 * @version 1.0
 * @date 2021/7/5 14:30
 */
@RestController
public class TestController {

    @Autowired
    private RemoteClient remoteClient;

    @GetMapping("/feign")
    public String test() {
        return remoteClient.helloNacos();
    }


    //TestController测试冲突提交
}
