package cn.merryyou.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * health接口
 */
@RestController
@RequestMapping("status")
public class StatusController {

    @RequestMapping("")
    public String getStatus() {
        return "OK";
    }

    @RequestMapping("test")
    public String getStatusTest() {
        return "testOK";
    }
}
