package com.alibaba.xinan.product.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XinAnzzZ
 * @date 2018/9/7 15:26
 */
@RestController
public class ServerController {

    @GetMapping("/test")
    public String test() {
        return "this is server controller test";
    }
}
