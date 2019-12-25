package com.czh.demo3.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sun.applet.resources.MsgAppletViewer;

@RestController
public class TestController {
    @Value("${app.msg}")
    private String msg;


    @GetMapping("/")
    public String testJson(){
        return msg;
    }
}
