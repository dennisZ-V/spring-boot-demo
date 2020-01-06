package com.dennis.spring.boot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Dinnes Zhang
 * @date
 */

@Controller
public class ThymeleafController {
    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("name","dennis");
        return "index";
    }
}
