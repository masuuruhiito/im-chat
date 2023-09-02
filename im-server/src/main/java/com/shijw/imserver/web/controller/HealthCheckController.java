package com.shijw.imserver.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SHI
 * @date 2023/9/3 1:24
 */
@RestController
@RequestMapping("/api/im/health")
public class HealthCheckController {

    @GetMapping("getCheck")
    public String getMethodCheck() {
        return "success";
    }
}
