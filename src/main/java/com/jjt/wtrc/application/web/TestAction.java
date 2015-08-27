package com.jjt.wtrc.application.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Pengrl on 2015/8/6.
 */
@Controller
@RequestMapping("/test")
public class TestAction {

    @RequestMapping
    public String test(){
        return "test";
    }
}
