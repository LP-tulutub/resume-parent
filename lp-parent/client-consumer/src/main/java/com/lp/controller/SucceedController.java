package com.lp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/succeed")
public class SucceedController {

    @RequestMapping("/{code}")
    public String code(@PathVariable int code, Model model){
        model.addAttribute("code", code);
        return "succeed";
    }
}
