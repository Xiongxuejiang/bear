package com.bear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by he on 2017/3/31.
 */

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}