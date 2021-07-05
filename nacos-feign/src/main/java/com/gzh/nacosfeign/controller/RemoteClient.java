package com.gzh.nacosfeign.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nacos-provide", fallback = RemoteHystrix.class)
public interface RemoteClient {

    @GetMapping("/helloNacos")
    String helloNacos();
}