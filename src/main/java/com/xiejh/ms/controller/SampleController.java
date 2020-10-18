package com.xiejh.ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiejh
 * @Date 2020/10/9 22:06
 **/
@Controller
@RequestMapping("/demo")
public class SampleController {

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","xiejh");
        return "hello";
    }
}
